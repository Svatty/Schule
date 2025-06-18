import java.util.Scanner;

public class arraySort{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("\nWie viele Zahlen sollen generiert werden");
    int n = scanner.nextInt();
    int[] rndZahl = new int[n];
    
    int arraySum = 0;
    
    for (int f = 0; f<n ;f++) {
      int randomNum = (int)(Math.random() * 101);
      rndZahl[f] = randomNum;
      System.out.println("Zahl "+ (f + 1) + ": " + randomNum);
      arraySum += rndZahl[f];
    }
    //System.out.println(arraySum);
    /*
    System.out.print("Welche Zahl soll gezählt werden? ");
    int target = scanner.nextInt();

    int count = 0;
        for (int num : rndZahl) {
            if (num == target) {
        count++;
      }
    }

    if (count > 0) {
      System.out.println("Die Zahl " + target + " kommt " + count + " mal vor.");
    } else {
      System.out.println("Die Zahl " + target + " kommt nicht im Array vor.");
    }*/
      System.out.println("Welche zwei Positionen sollen getauscht werden?");
      int index1 = scanner.nextInt() - 1;
      int index2 = scanner.nextInt() - 1;
    
      int temp = rndZahl[index1];
      rndZahl[index1] = rndZahl[index2];
      rndZahl[index2] = temp;

    for (int m = 0; m<n ;m++) {
      System.out.println("Zahl "+ (m + 1) + ": " + rndZahl[m]);
    }
  }
}

