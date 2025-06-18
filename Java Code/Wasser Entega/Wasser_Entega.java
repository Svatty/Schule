import java.util.Scanner;

public class Wasser_Entega{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Scanner stringScanner = new Scanner(System.in);
    
    System.out.println("Gebe bitte den alten Wasserstand ein");
    double alterStand = scanner.nextDouble();
    
    System.out.println("Gebe bitte den neuen Wasserstand ein");
    double neuerStand = scanner.nextDouble();

    System.out.println("Gebe bitte den Wasserpreis pro m³ ein");
    double wasserpreis = scanner.nextDouble();
    
    System.out.println("Gebe bitte den Monatlichen Grundpreis an");
    double montGrund = scanner.nextDouble() * 12;    

    System.out.println("Gebe bitte die Umsatzsteuer angeben");
    double umstzSteuer = scanner.nextDouble();
    
    double verbrauch = neuerStand - alterStand;
    
    double nettoKosten = (verbrauch * wasserpreis) + montGrund;
    
    if(verbrauch < 100){
      nettoKosten = nettoKosten + 50;
      System.out.println("Zu geringer Wasserverbrauch, Strafe von 50$");
    }
    
    System.out.println("Netto Kosten " + nettoKosten);
    
    double bruttoKosten = Math.round(100 * (nettoKosten +(nettoKosten * umstzSteuer/100)));
    
    System.out.println("Brutto Kosten " + bruttoKosten / 100);
  }
}
