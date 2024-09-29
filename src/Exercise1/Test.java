package Exercise1;
import java.util.Random;
import java.util.Scanner;

public class Test
{
    int ans[] = new int[] {4, 1, 2, 3, 2}; // correct answers
    int c = 0;
    int inc = 0;
    public static String[] simulateQuestion()
    {
        String qs[] = new String[]
                {
                        "Question 1: How many parameters can a method have?\n1)0 \n2)3 \n3)5 \n4)Unlimited",
                        "Question 2: How many constructors are given as default to a class?\n1)0 \n2)1 \n3)2 \n4)None",
                        "Question 3: The IDE in the Eclipse IDE stands for?\n1)Information Database Execution \n2)Integrated Development Environment \n3)International Debug Environment \n4)Information Directory Executive",
                        "Question 4: What does API stand for? \n1)Applied Practice Integration \n2)Automated Programming Interaction \n3)Application Programming Interface \n4)Applicable Programming Iterations",
                        "Question 5: What year was java founded in? \n1)1990 \n2)1995 \n3)1867 \n4)1992"
                };
        return qs;
    }
    public void checkAnswer(int a, int b)
    {
            if (a != b) // if answer incorrect
            {
                System.out.println(generateMessage(false) + " Answer: " + ans[ c+inc ] );
                inc++;
            }
            else// else if its correct answer
            {
                System.out.println(generateMessage(true));
                c++;
            }
    }
    public String generateMessage(boolean m)
    {
        Random rand = new Random();
        if (m == true) // if answer is correct
        {
            switch (rand.nextInt(4))
            {
                case 0:
                    return "Excellent!";

                case 1:
                    return "Good!";

                case 2:
                    return "Keep up the good work!";

                case 3:
                    return "Nice work!";
            }
        }
        else // if answer is wrong
        {
            switch (rand.nextInt(4))
            {
                case 0:
                    return "No. Please try again";

                case 1:
                    return "Wrong. Try once more";

                case 2:
                    return "Don't give up!";

                case 3:
                    return "No. Keep trying..";
            }
        }
        return "";
    }
    public void inputAnswer()
    {
        String b[] = simulateQuestion();
        int a[] = new int[b.length];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + "\nAnswer is: ");
            a[i] = s.nextInt();
            checkAnswer(a[i], ans[i]);
        }
        float percent = (float) c /ans.length*100;
        System.out.println("Correct answers: " + c + ", Incorrect answers: " + inc + ", Percentage of correct answers: " + percent + "%");
    }
    public static void main(String[] args)
    {
        new Test().inputAnswer();
    }

}
