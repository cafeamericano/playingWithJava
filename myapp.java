public class Application {

  // Function
  static void printILikePie() {
    System.out.println("I like pie!");
  }

  // Function
  static void printILikeCake() {
    System.out.println("I like cake!");
  }

  // Run program
  public static void main(String[] args) {
    printILikePie();
    printILikeCake();
    for (int i = 0; i < 5; i++) {
      System.out.println("Here's the number " + i);
    }
  }

}