import java.util.Scanner;

public class Health extends Insurance
{
    public void setInsuranceCost(double cost)
    {
        this.setMonthlyCost(cost/12);
    };
    public void displayInfo(Insurance ins)
    {
        System.out.println("Insurene Type[Life or Health]: Health");
        System.out.println("Insurance monthly price: " + ins.getMonthlyCost());

    };

}
