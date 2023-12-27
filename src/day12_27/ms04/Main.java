package day12_27.ms04;
class Post {
    String author;
    String contents;
    int likes;

    void like() {
        System.out.println("좋아요 클릭");
        likes++;
    }
}

public class Main {
    public static void main(String args[]) {
        // 지시사항 1번을 참고하여 코드를 작성하세요.
        Post p = new Post();
        System.out.println(p.likes);
        // 지시사항 2번을 참고하여 코드를 작성하세요.
        while(p.likes != 5){
            p.like();
        }

        // 지시사항 3번을 참고하여 코드를 작성하세요.
        System.out.println(p.likes);


    }
}
