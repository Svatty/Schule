import java.util.Scanner;
 
public class ValueNoise {
  public static void main(String args[]) {
    int x = 7;
    int y = 15;
    
//    String tile_0 = " ";
//    String tile_05 = "¦¦";
//    String tile_1 = "¦¦";
    
    String tile_0 = " ";
    String tile_05 = "::";
    String tile_1 = "#";

    String[] tileSprite = {"¦¦", "¦"};

    int i;
    int j;
    String[][] map = new String [x][y];
    int[][] height = new int[x][y];

    //Base noise generation
    for(i = 0; i < x; i++){
      for(j = 0; j < y; j++){
        int tileRnd = (int)(Math.random() * 3);
        if(tileRnd == 0){
          System.out.print(tile_0);
          map[i][j] = tile_0;
          height[i][j] = 0;
        }
        else{
          System.out.print(tile_1);
          map[i][j] = tile_1;
          height[i][j] = 1;
        }
      }
      System.out.println("");
    }
    /*Scanner scanner = new Scanner(System.in);
    while(true){
    int tile_x = scanner.nextInt();
    int tile_y = scanner.nextInt();
    System.out.println(map[tile_x][tile_y]);
    }*/
    
    int k;
    int u;
    float new_height;
    
    for(k = 0; k < x; k++){
      for(u = 0; u < y; u++){
        new_height = (height[u][k] + height[u + 1][k + 1])/2;
        System.out.print(new_height);
        if(new_height == 0){
          System.out.print(tile_0);
        }else if(new_height == 0.5){
            System.out.print(tile_05);
          }else{
            System.out.print(tile_1);
          }
      }
    }
  }
}
