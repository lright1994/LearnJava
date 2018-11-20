public class HelloWorld {

  public static void main(String[] args) {
      // Prints "Hello, World" to the terminal window.
      System.out.println("Hello, Nerd");
      int[] a = {1,2,3};
      int[] b = a;

      a = null;
      b = new int[4]; //{1,2,3} is lost. java has GC
      System.out.println(b[1]);
  }


  public static void test(String[] args){

    System.out.println(args);
  }

}
