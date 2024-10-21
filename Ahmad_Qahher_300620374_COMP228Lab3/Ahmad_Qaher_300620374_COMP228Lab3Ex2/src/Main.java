import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean bol = false;
        String ans;
        Scanner scan = new Scanner(System.in);

        while (!bol) {

            System.out.println("Are you a fulltimer or parttimer? ");
            ans = scan.nextLine().toUpperCase();
            if (ans.equals("FULLTIMER")) {
                FullTimeGameTester ft = new FullTimeGameTester();
                ft.Salary();
                System.out.println(ft.toString());
                bol = true;
            } else if (ans.equals("PARTTIMER")) {
                PartTimeGameTester pt = new PartTimeGameTester();
                pt.Salary();
                System.out.println(pt.toString());
                bol = true;
            } else {
                System.out.println("Invalid input, try again!");
                bol = false;
            }
        }


    }
}