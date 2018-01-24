package ch2Labs;

import java.awt.Rectangle;

public class RectanglePrinter
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 0, 100, 50);
      Rectangle r2 = r1;
      r2.grow(10, 20);

      //Outputs r2 which is the same as r1, because they're the same object.
      //Modifying one modifies the other.
      System.out.println(r1);
      System.out.println(r2);
   }
}
