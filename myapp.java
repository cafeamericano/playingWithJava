public class Application {

  // Pie function
  static void printILikePie() {
    System.out.println("I like pie!");
  }

  // Cake function
  static void printILikeCake() {
    System.out.println("I like cake!");
  }

  // Spit numbers function
  static void spitNumbers() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Here's the number " + i);
      if (i < 2) {
        System.out.println("That number's less than 2.");
      } else if (i == 2) {
        System.out.println("That number's equal to 2!");
      } else {
        System.out.println("That number's greater than 2.");
      }
    }
  }

  int x = 5;
  int y = 7;

  public static void main(String[] args) {
    Application myObj1 = new Application();
    Application myObj2 = new Application();
    System.out.println(myObj1.x);
    System.out.println(myObj2.y);
    printILikePie();
    printILikeCake();
    spitNumbers();
  }

}