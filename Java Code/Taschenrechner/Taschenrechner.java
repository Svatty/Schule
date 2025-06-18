import java.util.Scanner;

public class Taschenrechner{
  public static void main(String[] args) { 
    Scanner intScanner = new Scanner(System.in);

    System.out.println("Gibt eine Zahl ein zum Addieren: 0 + ?");
    
    int zahlVorher = 0;

    while(true){
      int zahl = intScanner.nextInt();
             
      int ergebniss = zahl + zahlVorher;
      
      if(zahl < 0){
        System.out.println("Das ergebniss beträgt: " + zahlVorher);
        break;
      }
      
      System.out.println(ergebniss + "+ ?");
      zahlVorher = ergebniss;      
    }
  }
}
