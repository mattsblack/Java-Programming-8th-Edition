import javax.swing.*;
public class FixDebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      final double TAX = 0.06;
      costString = JOptionPane.showInputDialog("Enter price of item you are buying"
      );
      cost = Double.parseDouble(costString);
      JOptionPane.showMessageDialog(null,"With " + TAX * 100 +
         "% tax,  purchase  is $" + (cost - cost * TAX));
   }
}
