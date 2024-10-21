import java.util.Scanner;

public class Life extends Insurance
{
    public void setInsuranceCost(double cost)
    {
        this.setMonthlyCost(cost/12);
    };
    public void displayInfo(Insurance ins)
    {
        System.out.println("Insurene Type[Life or Health]: Life");
        System.out.println("Insurance monthly price: " + ins.getMonthlyCost());

    };
}
