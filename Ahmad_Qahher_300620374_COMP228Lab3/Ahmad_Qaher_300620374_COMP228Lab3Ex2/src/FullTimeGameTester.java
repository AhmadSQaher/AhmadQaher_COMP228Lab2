public class FullTimeGameTester extends GameTester
{
    @Override
    public void Salary()
    {
        this.salary = 3000;
    }

    @Override
    public String toString()
    {
         return "Base salary for a Fulltime game tester is: " + this.salary;
    }
}
