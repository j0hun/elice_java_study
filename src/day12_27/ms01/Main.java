package day12_27.ms01;

public class Main {
    public static int char2Int(char c) {
        if('a' <= c && c <= 'z') {
            return c - 'a';
        }
        else {
            return -1;
        }
    }

    public static char int2Char(int i) {
        if (0 <= i && i <= 25) {
            return (char)(i + 'a');
        }
        else {
            return ' ';
        }
    }

    public static void main(String args[]) {
        String word = "aworncjdvjQGOJSKejoappgWEkvXXXaSoemflQoekfmdkcGLKDoekfldmvAjsndfndSINEPVasiejfQDMFPBmSNDaixmdFLEfisldifEMDLF";
        // 지시사항 1번을 참고하여 코드를 작성하세요.
        word = word.toLowerCase();
        // 지시사항 2번을 참고하여 코드를 작성하세요.
        int[] arr = new int[26];
        // 지시사항 3번을 참고하여 코드를 작성하세요.
        for(int i=0;i<word.length();i++){
            arr[char2Int(word.charAt(i))] += 1;
        }

        // 지시사항 4번을 참고하여 코드를 작성하세요.
        int max = 0;
        for(int i=1;i<26;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        System.out.println(int2Char(max));

    }
}

