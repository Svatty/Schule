import java.util.Scanner;

public class packstation{
  public static void main(String[] args) { 
    Scanner intScanner = new Scanner(System.in);
    
    System.out.println("Wie teuer ist ihr Produkt?");
    int versandPreis = intScanner.nextInt();
    int finalPreis;
    
    if(versandPreis < 100){
      finalPreis = versandPreis + 3 + 2;
    }
    else if(versandPreis >= 100 && versandPreis <= 200){
      finalPreis = versandPreis + 2;
    }
    else{
      finalPreis = versandPreis;
    }
    System.out.println("Die Gesamtkosten betragen: " + finalPreis);
  }
}
