package Tel_Java_Prac;

abstract class Car {
    public abstract void drive();
//    {
//
//    }
    public abstract void fly();
    public void playMusic()
    {
        System.out.println("play music");
    }
}
abstract class Swift extends Car {               // if  i remove fly then get abstract
//    public void fly(){
//        System.out.println("swift flying..");
//    }
    public void drive(){
        System.out.println("swift driving....");
    }
}
class UpdatedSwift extends Swift {     // concrete class
    public void fly(){
        System.out.println("swift flying....");
    }
}
public class Abstract_Ex {
    public static void main(String[] args) {
        Car obj = new UpdatedSwift();  // cannot create object of abstact class  , so can i create reference of abstract class  create an object of Swift
        obj.drive();
        obj.playMusic();    // dynamic method dispatch
        obj.fly();
    }
}