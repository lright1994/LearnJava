package buaa.lright;

//use the interface as abstract factory, every factory that implements the interface
//can produce object as factory

//method in interface is public
interface produce{
    Food Get();
}

class FactoryA implements produce{
    public Food Get(){
        return new AFood();
    }
}
class FactoryB implements produce{
    public Food Get(){
        return new BFood();
    }
}

public class AbFactory{
    public static void main(String[] args) {
        Food a = new FactoryA().Get();
        a.eat();
    }
}