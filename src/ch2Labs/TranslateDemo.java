package ch2Labs;

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class TranslateDemo
{
   public static void main(String[] args)
   {
      JFrame warframe = new JFrame();
      warframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      warframe.setVisible(true);
      Rectangle rec = new Rectangle(400, 200, 690, 420);
      warframe.setBounds(rec);
      JOptionPane.showMessageDialog(warframe, "Click OK to continue.");
      rec.translate(200, 200);
      warframe.setBounds(rec);
   }
}
