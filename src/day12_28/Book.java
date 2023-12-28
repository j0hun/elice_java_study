package day12_28;

public class Book {

    String name;
    int pages;
    int currentPage;
    Book(){

    }

    Book(String name){
        this.name = name;
    }

    Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    public void nextPage(){
        this.currentPage += 1;
    }

    public String changeName(String name){
        this.name = name;
        return name;
    }

}
