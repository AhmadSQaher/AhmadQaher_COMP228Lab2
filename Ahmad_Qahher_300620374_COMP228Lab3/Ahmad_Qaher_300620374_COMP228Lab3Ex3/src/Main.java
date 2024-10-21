import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mortgage number: ");
        int number = scan.nextInt();
        System.out.println("Enter your name: ");
        String name = scan.next();
        boolean test =  true;
        double amount = 0;

        while (test == true) {
            System.out.println("Enter amount of mortgage: ");
            amount = scan.nextDouble();
            if (amount > Mortgage.maxMort) {
                System.out.println("Mortgage amount passsed the max, max is " + Mortgage.maxMort);
            }
            else
            {


                test = false;
            }
        }
        System.out.println("Enter interest rate: ");
        double interest = scan.nextDouble();
        boolean test2 = false;
        int term;
        System.out.println("Enter term:[1,3,5] ");
        if (scan.nextInt() == 1 || scan.nextInt() == 3 || scan.nextInt() ==5)
        {
            term = scan.nextInt();
        }
        else
        {
            System.out.println("Not a valid entry, will be defaulted to 1 year");
            term = 1;
        }
        System.out.println("Personal or Business: ");
        String type = scan.nextLine().toUpperCase();
        if (type.equals("BUSINESS"))
        {
            BusinessMortgage bm = new BusinessMortgage();
            bm.mortNum = number;
            bm.name = name;
            bm.amount = amount;
            bm.term = term;
            bm.BusinessMortgage(interest);
        }
        else if (type.equals("PERSONAL"))
        {
            PersonalMortgage pm = new PersonalMortgage();
            pm.mortNum = number;
            pm.name = name;
            pm.amount = amount;
            pm.term = term;
            pm.PersonalMortgage(interest);
        }

    }
}