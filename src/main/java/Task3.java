public class Task3 {

  public static void main(String[] args) {

    double currentPrice = 99.99;
    String certificate = "R";

    if(certificate.equals("A")){
      System.out.println("Your new price is:" + (currentPrice - (0.7*currentPrice)));
    }
    else if (certificate.equals("B")) {
      System.out.println("Your new price is:" + (currentPrice - (0.5*currentPrice)));
    }
    else if (certificate.equals("C") || certificate.equals("D")) {
      System.out.println("Your new price is:" + (currentPrice - (0.2*currentPrice)));
    }
    else if (certificate.equals("D") || certificate.equals("E") ) {
      System.out.println("Your new price is:" + (currentPrice - (0.1*currentPrice)));
    }
    else {
      System.out.println("Your new price is:" + (currentPrice - (0.02*currentPrice)));
    }

    System.out.println("---------------------");

    Certificate certificate1 = Certificate.A;
    switch (certificate1) {
      case A:
        System.out.println("Your new price is:" + (currentPrice - (0.7 * currentPrice)));
        break;
    case B:
        System.out.println("Your new price is:" + (currentPrice - (0.5 * currentPrice)));
        break;
    case C:
        System.out.println("Your new price is:" + (currentPrice - (0.2 * currentPrice)));
        break;
    case D:
      case E:
        System.out.println("Your new price is:" + (currentPrice - (0.1 * currentPrice)));
        break;
      default:
        System.out.println("Your new price is:" + (currentPrice - (0.02*currentPrice)));
    }

 }
  public enum Certificate{
    A, B, C, D, E;
  }

}
