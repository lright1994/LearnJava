package buaa.lright;

public enum Singleton{
    INSTANCE;
    public void singleMethod(){
        System.out.println("singleton");
    }
}

class client{
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        s1.singleMethod();
        System.out.println("s1==s2?"+(s1==s2));
    }
}