import java.util.Scanner;

public class weight_watcher{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Scanner stringScanner = new Scanner(System.in);
    
    //spagetti kcal 158
    // fett 0.9
    
    System.out.println("was gibt es zu essen?");
    String essen = stringScanner.next();
    
    System.out.println("kcal pro 100g");
    double kcal = scanner.nextDouble();
    
    System.out.println("Fettgehalt pro 100g");
    double fettgehalt = scanner.nextDouble();
    
    double wwp = (kcal/60)+(fettgehalt/9);
    
    double rounded = Math.round(wwp * 2)/2;
    
    System.out.println(essen + "beträgt einen Weight Watcherwert von: "+ rounded);
  }
}
