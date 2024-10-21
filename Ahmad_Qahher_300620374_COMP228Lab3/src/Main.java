import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Insurance[] insurance = new Insurance[50];
        boolean val = false;
        boolean leave = false;

        for (int i = 0 ; i < insurance.length;)
        {
            while (val == false)
            {
                System.out.println("What is the type of insurance? [Health or Life]");
                String type = scan.nextLine();
                if (type.equals("Life")) {
                    Life life = new Life();
                    System.out.println("What is the anual cost of the Life insurance: ");
                    double price = scan.nextDouble();
                    life.setInsuranceCost(price);
                    val = true;
                    insurance[i] = life;
                    i++;

                    while (leave == false)
                    {
                        System.out.println("Do you want to add another entry? [Y/N]");
                        String more = scan.nextLine().toUpperCase();
                        if (more.equals("N"))
                        {
                            leave = true;
                            val = true;

                            break;
                        } else if (more.equals("Y"))
                        {
                            leave = true;
                            val = false;
                        }
                        else
                        {
                            System.out.println("Invalid input, try again");
                        }
                    }
                }
                else if (type.equals("Health"))
                {
                    Health health = new Health();
                    System.out.println("What is the anual cost of the Health insurance: ");
                    health.setInsuranceCost(scan.nextDouble());
                    val = true;
                    insurance[i] = health;
                    i++;

                    boolean lea = false;
                    while (lea = false) {
                        System.out.println("Do you want to add another entry? [Y/N]");
                        String more = scan.next();
                        if (more.equals("N")) {
                            lea = true;
                            val = true;
                            break;
                        } else if (more.equals("Y")) {
                            lea = true;
                        } else {
                            System.out.println("Invalid input, try again");
                        }
                    }
                }
                else
                {
                    System.out.println("Invalid input, try again!");
                }

                /*boolean leave = false;
                while (leave == false)
                {
                    System.out.println("Do you want to add another entry? [Y/N]");
                    String more = scan.nextLine().toUpperCase();
                    if (more.equals("N"))
                    {
                        leave = true;
                        break;
                    }
                    else if (more.equals("Y"))
                    {
                        leave = true;
                    }
                    else
                    {
                        System.out.println("Invalid input, try again");
                    }
                }*/
            }

        }
        for (Insurance ins : insurance)
        {
            ins.displayInfo(ins);
        }

    }
}