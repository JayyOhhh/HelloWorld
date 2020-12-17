public class HelloWorld{
  public static void main (String[] args){

    System.out.println("Hello, World!");
    System.out.println();




    makeTriangle();
    makeTriangle();
    makeTriangle();
    makeTriangle();
    makeTriangle();
    makeSquare();
    makeSquare();
    makeSquare();




  }// end main method


  public static void makeTriangle(){



    // body for making a triangle
    System.out.println("-----------");
    System.out.println("\\         /");
    System.out.println(" \\       /");
    System.out.println("  \\     /");
    System.out.println("   \\   /");
    System.out.println("    \\ /");
  }// end makeTriangle method

  public static void makeSquare(){

    //body for making a square
    System.out.println(" _____________");
    System.out.println("|             |");
    System.out.println("|             |");
    System.out.println("|             |");
    System.out.println("|             |");
    System.out.println(" _____________");

  }//end makeSquare method


}// end HelloWorld class
