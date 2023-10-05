package advance;
public class Employee 
{
    private String name;
    private int id;
    private double salary;  
    public Employee(String name, int id, double salary) 
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

      public String getName() 
      {
        return name;
      }

       public int getId() 
       {
        return id;
       }

    
    public double getSalary() 
    {
        return salary;
    }

    
    public void raiseSalary(double amount) 
    {
        if (amount >= 0) 
        {
            salary += amount;
            System.out.println(name + "'s salary has been raised by $" + amount);
        } 
        else 
        {
            System.out.println("Invalid raise amount. Salary remains unchanged.");
        }
    }

    public static void main(String[] args) 
    {
       
        Employee employee = new Employee("Adhi", 503, 50000.0);      
        System.out.println("Initial Salary: $" + employee.getSalary());
        employee.raiseSalary(2000.0);       
        System.out.println("Updated Salary: $" + employee.getSalary());
    }
}

