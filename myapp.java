public class Person {

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

  static void aboutMe(String X, String Y) {
    Person objName = new Person();
    String name;
    String favoriteColor;
    objName.name = X;
    objName.favoriteColor = Y;
    System.out.println(objName.name);
    System.out.println(objName.favoriteColor);
  }

  // Property initializations
  String name = "";
  String favoriteColor = "";

  // Run program
  public static void main(String[] args) {

    // Standard functions
    printILikePie();
    printILikeCake();
    spitNumbers();

    aboutMe("Red", "Blue");
  }

}