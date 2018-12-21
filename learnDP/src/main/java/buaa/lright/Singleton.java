package buaa.lright;

enum Singleton{
    INSTANCE;
    private Singleton(){};
    public void singleMethod(){
        System.out.println("build singleton by enum");
    }
}

class SingleSIC{
    private SingleSIC(){};

    private static final class SingleBuild{
        private static SingleSIC instance = new SingleSIC();
    }
    public static SingleSIC getSingleSIC(){
        return SingleBuild.instance;
    }
    public void singleMethod(){
        System.out.println("build singleton by inner static class");
    }
}

class client{
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        s1.singleMethod();
        System.out.println("s1==s2?: "+(s1==s2));

        SingleSIC sc1 = SingleSIC.getSingleSIC();
        SingleSIC sc2 = SingleSIC.getSingleSIC();
        sc1.singleMethod();
        System.out.println("sc1==sc2?: "+(sc1==sc2));
    }
}