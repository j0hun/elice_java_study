package day12_29.Quiz02;

// 여기에 Character 클래스와 Player 클래스를 만들어주세요.
class Character{
    public String name;
    protected int level;
    void printDetails(){
        System.out.println("이름 : " + name);
        System.out.println("레벨 : " + level);
    }
    public Character(String name, int level){
        this.name = name;
        this.level = level;
    }
}

class Player extends Character{
    private int experience;
    void printDetails(){
        super.printDetails();
        System.out.println("경험치 : " + experience);
    }
    public Player(String name, int level, int experience){
        super(name, level);
        this.experience = experience;
    }
}
public class Main {
    public static void main(String args[]) {
        Character character = new Character("Knight", 10);
        Player player = new Player("Mage", 15, 1000);

        character.printDetails();
        player.printDetails();
    }
}
