package buaa.lright;


interface Food{
    void eat();
}

class AFood implements Food{
    public void eat(){
        System.out.println("A");
    }
}
class BFood implements Food{
    public void eat(){
        System.out.println("B");
    }
}
// static factory, no need for instance
public class Factory {
    public static void main(String[] args) {
        Factory.GetA().eat();
        Factory.GetB().eat();
    }
    public static Food GetA(){return new AFood();}
    public static Food GetB(){return new BFood();}
}