public abstract class Insurance
{
    public String getInsuranceType()
    {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo(Insurance ins);

    public String insuranceType;
    public double monthlyCost;
}
