public class Task2 {

  public static void main(String[] args) {

    int mark = 26;

    if (mark >= 0 && mark < 25) {
      System.out.println("F");
    } else if (mark >= 25 && mark < 45) {
      System.out.println("E");
    } else if (mark >= 45 && mark < 50) {
      System.out.println("D");
    } else if (mark >= 50 && mark < 60) {
      System.out.println("C");
    } else if (mark >= 60 && mark < 80) {
      System.out.println("B");
    } else if (mark >= 80 && mark <= 100) {
      System.out.println("A");
    }
  }
}
