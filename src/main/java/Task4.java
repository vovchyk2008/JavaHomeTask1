public class Task4 {

  public static void main(String[] args) {

    int i = 0;
    while (i <= 30) {
      if (i == 15) {
        System.out.println("");
      } else if (i == 25) {
        System.out.println(i + " Hola from Spain");
      } else if (i % 2 == 0) {
        System.out.println(i + " Hello from England");
      } else {
        System.out.println(i + " Привіт з України");
      }
      i++;
    }

    System.out.println("---------------");

    for (int j = 0; j <= 30; j++) {
      if (j == 15) {
        System.out.println("");
      } else if (j == 25) {
        System.out.println(j + " Hola from Spain");
      } else if (j % 2 == 0) {
        System.out.println(j + " Hello from England");
      } else {
        System.out.println(j + " Привіт з України");
      }
    }

  }


}
