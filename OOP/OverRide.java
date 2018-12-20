class Book{
    private void read(){
        System.out.println("this is a book");
    }

    public void foo(){
        this.read();
        this.write();
    }

    void write(){
        System.out.print("write book");
    }
}
class JavaBook extends Book{
    public void read(){
        System.out.println("this is java book");
    }
    public void write(){
        System.out.println("write java book");
    }
}

class JavaDemo{
    public static void main(String[] args) {
        JavaBook jb = new JavaBook();
        jb.foo();  //private method will never be override!
        Book bk = new JavaBook();
        bk.foo();
    }
}