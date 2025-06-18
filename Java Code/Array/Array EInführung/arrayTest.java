import java.util.Scanner;

public class arrayTest{
  public static void main(String[] args) {
    Scanner intScanner = new Scanner(System.in);
    
    System.out.println("\nWie viele Zahlen sollen generiert werden");
    int n = intScanner.nextInt();
    int[] rndZahl = new int[n];
    
    for (int f = 0; f<n ;f++) {
      int randomNum = (int)(Math.random() * 101);
      System.out.println("Zahl "+ (f + 1) + " : "+randomNum);
      rndZahl[f] = randomNum;
    }
    
    int kleinsteZahl = rndZahl[0];
    
    for(int i = 1; i < rndZahl.length; i++){
      if(rndZahl[i] < kleinsteZahl) {
        kleinsteZahl = rndZahl[i];
      }
    }
    System.out.println("\nDie kleinste Zahl im Array ist: " + kleinsteZahl);
  }
}

