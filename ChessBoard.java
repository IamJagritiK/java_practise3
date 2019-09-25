import java.util.Scanner;

public class ChessBoard {

   
public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int noOfRow =scan.nextInt();
    int noOfColumn=scan.nextInt();

    String output[][] = new String[noOfRow][noOfColumn];
            for (int i = 0; i < noOfRow; i++) {
                for (int j = 0; j < noOfColumn; j++) {
                    if (((i + j) % 2) == 0) {
                        output[i][j] = "WW|";
                    } else {
                        output[i][j] = "BB|";
                    }

                }


            }
            
      for(int i=0;i<noOfRow;i++)
      {
          for(int j=0;j<noOfColumn;j++)
          {
              System.out.print(output[i][j]);
          }
          System.out.println("");
      }
      
    }
}
