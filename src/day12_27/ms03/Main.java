package day12_27.ms03;

class Post {
    // 지시사항 1번을 참고하여 코드를 작성하세요.
    String author;
    String contents;
    int likes;

    String like(){
        likes+=1;
        return "좋아요 클릭";
    }


}

public class Main {
    public static void main(String args[]) {
        Post p = new Post();
        p.like();
    }
}
