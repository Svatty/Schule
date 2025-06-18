import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Gewicht eingabe");
    double gewicht = scanner.nextDouble();
    
    System.out.println("Größe eingabe");
    double groesse = scanner.nextDouble();

    double bmi;
    
    bmi = 10000 * gewicht / (groesse * groesse);
    System.out.println(bmi);
  }
}
