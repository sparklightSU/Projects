package ch2Labs;

public class NumberVariablesPrinter
{
   public static void main(String[] args)
   {
      double n1 = 150;
      double n2 = n1;

      n2 = n2 * 20; // Grow n2

      //By declaring n2 as n1, since they are primitive types, they do not modify each other
      //They're not objects.
      System.out.println(n1);
      System.out.println(n2);
   }
}
