import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImageGreeter
{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL("http://files.gamebanana.com/img/ico/sprays/520832fc226e6.png");
      



      JOptionPane.showMessageDialog(null, "What's up Dawg?", "Title",
         JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
      System.exit(0);
   }
}
