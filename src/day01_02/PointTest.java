package day01_02;

public class PointTest {

    public static void main(String[] args) {

        Point3D point3D = new Point3D(1,2,3);
        point3D.printPoint3D();
        // x,y => point 의 멤버변수
        // z => Point3D 의 멤버변수
        // super 키워드로 초기화
    }

}


class Point {

    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void printPoint(){
        System.out.println("x : " + this.x);
        System.out.println("y : " + this.y);
    }
}

class Point3D extends Point {

    int z;
    public Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    public void printPoint3D(){
        super.printPoint();
        System.out.println("z : " + this.z);
    }
}