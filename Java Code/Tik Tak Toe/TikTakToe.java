import java.util.Scanner;
 
public class TikTakToe{
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    
    String[][] spielBrett = new String[3][3];
    String feldLeer = "[ ]";
    String feldX = "[X]";
    String feldO = "[O]";
    
    boolean besezt = false;
    
    String[] spieler = {"X","O"};
    int spielerIndex = 0;
    
    
    boolean gewonnen = false;
    
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
          System.out.print(feldLeer);
          spielBrett[i][j] = feldLeer;
        }
        System.out.println("");
    }
    
    while (!gewonnen){
      if(spielerIndex == 0){
        System.out.println(spieler[spielerIndex] + " ist dran");
        
        
        while(besezt = true){
          int feld_x = scanner.nextInt();
          int feld_y = scanner.nextInt();
          
          if(spielBrett[feld_x][feld_y] == feldLeer){
            spielBrett[feld_x][feld_y] = feldX;
            besezt = false;
            break;
          }else{
            System.out.println("Feld besezt bitte erneut eingeben");
            besezt = true;
          }
        }
        
        for(int i = 0; i < spielBrett.length; i++){
          for(int j = 0; j < spielBrett[i].length; j++){
            System.out.print(spielBrett[i][j]);
          }
          System.out.println("");
        }
        spielerIndex++;
      }
      else{
        System.out.println(spieler[spielerIndex] + " ist dran");
        
        while(besezt = true){
          int feld_x = scanner.nextInt();
          int feld_y = scanner.nextInt();
          
          if(spielBrett[feld_x][feld_y] == feldLeer){
            spielBrett[feld_x][feld_y] = feldO;
            besezt = false;
            
            CheckWinCondition();
            
            break;
          }else{
            System.out.println("Feld besezt bitte erneut eingeben");
            besezt = true;
          }
        }
        
        for(int i = 0; i < spielBrett.length; i++){
          for(int j = 0; j < spielBrett[i].length; j++){
            System.out.print(spielBrett[i][j]);
          }
          System.out.println("");
        }
        spielerIndex--;
      }
    } // end of while
    
    //System.out.println("Spieler " + spieler[spielerIndex] + " hat gewonnen");  
  }
  
  void CheckWinCondition();{
    System.out.println("FUnktioniert");
  }
}
