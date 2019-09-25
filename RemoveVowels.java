import java.util.*;

public class RemoveVowels {
    



    public static void main(String[] args) {
 
        String[] vowels = new String[5];
     
        vowels[0] = "a";
        vowels[1] = "e";
        vowels[2] = "i";
        vowels[3] = "o";
        vowels[4] = "u";
     
        String[] instruments = new String[4];

        Scanner scan=new Scanner(System.in);
            System.out.println("Enter the name of the cities:");
        
     
        for (int i = 0; i < instruments.length; i++)
        {
            String str = scan.nextLine();
            instruments[i]=str;
            

        }
     
        for (int a = 0; a < instruments.length; a++)
         {
            String instrument = instruments[a];
     
            for (int i = 0; i < vowels.length; i++)
            {
                instrument = instrument.replace(vowels[i], "");
            }
     
            System.out.println(instrument);
         }
        }
    }