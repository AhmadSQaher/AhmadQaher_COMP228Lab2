import java.util.Scanner;

public class PartTimeGameTester extends GameTester
{
    public void Salary()
    {
        double total;
        System.out.println("Enter the number of hours worked for part-timer: ");
        Scanner scan = new Scanner(System.in);
        this.hours = scan.nextDouble();
        total = this.hours * 20;
        this.salary = total;
    }
    public String toString()
    {
        return "Salary for Part-Time game tester is: " + this.salary;
    }
}
