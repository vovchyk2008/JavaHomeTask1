public class Task1 {

  public static void main(String[] args) {

    int a = 100;
    int b = 50;

    if ((a * b) < 1000 && a % b == 0) {
      System.out.println("Batman");
    } else if ((a / b) > 1 || a - b == 2) {
      System.out.println("Robin");
    } else {
      System.out.println("");
    }

  }

}
