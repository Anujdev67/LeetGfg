class Keyboard{ // parent class    super class
     int keys;  // instance variable
    private String color;
//    public void setKeys(int keys){
//        this.keys = keys;
//    }

    public int getKeys() {
        return keys;
    }
    public void setKeys(int keys){

    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //int keys=100;
    //String color = "White";
    public void pressed(){
        System.out.println("Signal Sent "+ color );
    }
    public void throwIt(){
        System.out.println("got hit");
        keys = 85;  // changed value new value will print 85 instead of 100
    }
    public void hitNum(){
        System.out.println("hit hard");
    }
}
class AdvKeyboard extends Keyboard{    // inheritance   this is child class   sub class
    public void hitNum(){
        System.out.println("sent number");
    }
}
//    public void throwIt(){          // override
//        System.out.println("got hit hard");
//    }


class Demo {
    public static void main(String[] args) {
        int num;  //primitive variable
        num = 8;
       AdvKeyboard obj;
       obj = new AdvKeyboard();
//        Keyboard obj;
//        obj = new Keyboard();
       obj.pressed();
       obj.throwIt();
       obj.hitNum();
        obj.setKeys(101);
        obj.setColor("Black");         //setters

        System.out.println(obj.keys);
        System.out.println(obj.getKeys());
        System.out.println(obj.getColor());     // encapsulation

//        Keyboard obj;
//        obj= new AdvKeyboard();     // overriding
//        obj.pressed();
//        obj.throwIt();
    }
}