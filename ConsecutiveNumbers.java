import java.util.Scanner;

public class ConsecutiveNumbers {

   

    public static void main(String[] args){

        int result = 0;

        System.out.println("Enter the string:");
        Scanner scan = new Scanner(System.in);

        String enterString = scan.nextLine();
        String[] array = enterString.split(",");
        for (int i = 0; i < array.length-1 ; i++) {
            int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);
            System.out.println(difference);
            if ((difference == 1 || difference == -1) && (result == 0)) {
                result = 0;
            } else {
                result = 1;
            
            }
        }

        if(result==1)
        System.out.println("not consecutive.");
        else
        System.out.println(" consecutive");      
        
    }
    } 
