import java.util.*;
import java.io.*;
public class MaximumOfEachLine
{
   public static void main(String[] args)
   {
      File f = new File("data.txt");
      try
      {
         Scanner file = new Scanner(f);
         while(file.hasNext())
         {
            String firstName = file.next();
            String lastName = file.next();
            String[] num = file.nextLine().split(" ");
            int max = Integer.parseInt(num[1]);
            for(int i = 2; i < num.length; i++)
            {
               int temp = Integer.parseInt(num[i]);
               if(max < temp)
               max = temp;
            }
            System.out.println(firstName +" "+ lastName +" Max: "+ max);
         }
      }
      catch(FileNotFoundException ex)
      {
         System.out.print("File Not Found");
      }
      catch(NumberFormatException ex)
      {
         System.out.print("Not a valid integer");
      }      
   }   
}