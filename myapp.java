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

  // About me function
  static void aboutMe(String first, String last, String favColor) {
    Person Individual = new Person();
    Individual.firstName = first;
    Individual.lastName = last;
    Individual.favoriteColor = favColor;
    System.out.println(Individual.firstName);
    System.out.println(Individual.lastName);
    System.out.println(Individual.favoriteColor);
  }

  // Individual object's property initializations
  String firstName = "";
  String lastName = "";
  String favoriteColor = "";

  // Run program
  public static void main(String[] args) {

    // Standard functions
    printILikePie();
    printILikeCake();
    spitNumbers();

    aboutMe("John", "Doe", "Yellow");
  }

}