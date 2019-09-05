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

  //Property initializations
  String name = "";
  String favoriteColor = "";

  //Run program
  public static void main(String[] args) {
    Application myObj = new Application();
    myObj.name = "Matthew";
    myObj.favoriteColor = "Orange";
    System.out.println(myObj.name);
    System.out.println(myObj.favoriteColor);
    printILikePie();
    printILikeCake();
    spitNumbers();
  }

}