public class Task5 {

  public static void main(String[] args) {

    int i = 0;
    int sum = 0;

    while (i <= 50) {
      sum += i;
      i++;
    }

    System.out.println(sum);

    int sum1 = 0;
    for (int j = 0; j <= 50; j++) {
      sum1 += j;
    }

    System.out.println(sum1);

  }

}
