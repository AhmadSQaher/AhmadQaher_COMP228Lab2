public abstract class Mortgage implements MortgageConstants
{
    public int mortNum;
    public String name;

    public int getMortNum() {
        return mortNum;
    }

    public void setMortNum(int mortNum) {
        this.mortNum = mortNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getIntRate() {
        return intRate;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public double amount;
    public double intRate;
    public int term;

}
