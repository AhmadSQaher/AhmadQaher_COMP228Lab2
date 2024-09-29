package Exercise2;
import java.util.Random;
import javax.swing.JOptionPane;

public class LottoGame
{
    public static void main(String[] args)
    {

        int maxRoll = 5;
        Boolean uWin = false;
        Lotto lotto = new Lotto();

        for (int i=0; i < maxRoll; i++)
        {
            int input = Integer.parseInt(JOptionPane.showInputDialog("Pick a number between 3 and 27"));

            if (input == lotto.getLottoSum())
            {
                uWin = true;
                break;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect, Try again");
            }
        }

        if (uWin)
        {
            JOptionPane.showMessageDialog(null, "Congrats, your the WINNER");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry, the number was " + lotto.getLottoSum() + ". Computer wins, better luck next time.");
        }
    }
}
