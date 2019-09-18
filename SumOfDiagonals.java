public class SumOfDiagonals
{
   public static void main(String[] args)
   {

      String[][] s1 = {{"2", "3", "4"},
                       {"5", "6", "7"},
                       {"8", "9", "10"}};

      String[][] s2 = {{"1", "2", "3"},
                       {"5", "6", "7"},
                       {"9", "10", "11"},
                       {"13", "14", "15"}};
                       
      String[][] s3 = {{"1", "2", "3", "4"},
                       {"5", "6", "7", "8"},
                       {"9", "10", "11", "12"},
                       {"13", "14", "15", "pp"}};
                       
      String[][] s4 = {{"1", "2", "3", "4"},
                       {"5", "6", "7", "8"},
                       {"9", "10", "11", "12"},
                       {"13", "14", "15", "16"}};
      //TODO Complete this method
      
   sumOfDiagonals(s1);
     
      
   }
   public static void sumOfDiagonals(String[][] x)
   {
      //TODO Complete this method
      try
      {
         if(x.length != x[0].length)
            throw new ArrayIndexOutOfBoundsException("Array is not a square");
         int sum = 0;
         for(int i = 0; i < x.length; i++)
         {
            for(int j = 0; j < x[i].length; j++)
            {
               if(i == j)
               {
                  int temp = Integer.parseInt(x[i][j]);
                  sum += temp;
               }
            }
         }
         System.out.print(sum);
      }
      catch(ArrayIndexOutOfBoundsException er)
      {
        System.out.println(er.getMessage());
      }  
      catch(NumberFormatException er)
      {
        System.out.println("Not a valid integer");
      }   
      
   }
}