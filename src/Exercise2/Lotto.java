package Exercise2;
import java.util.Random;
import javax.swing.JOptionPane;

public class Lotto
{
    private int[] lottoNums;

    public Lotto()
    {

        lottoNums = new int[3];
        Random rndm = new Random();
        for (int i = 0; i < 3; i++)
        {
            lottoNums[i] = rndm.nextInt(9) + 1;
        }
    }

    public int[] getLottoNums()
    {
        return lottoNums;
    }

    public int getLottoSum()
    {
        int sum = 0;
        for (int i = 0 ; i < 3 ; i++)
        {
            sum += lottoNums[i];
        }
        return sum;
    }
}
