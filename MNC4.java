class Employee
{
    void salary()
    {
        System.out.println("salary = 25000");
    }
}
class Programmer extends Employee
{
    void bonus()
    {
        System.out.println("bonus = 5000");
    }
}
class MNC3
{
    public static void main(String args[])
    {
        Programmer p = new Programmer();
        p.salary();
        p.bonus();
    }
}
   
