package advance;
public class Account
{
    private double balance;

    public Account()
    {
        this.balance = 0.0;
    }
    public Account(double iniBal)
    {
        if (iniBal >= 0) 
        {
            this.balance = iniBal;
        } 
        else 
        {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.0.");
            this.balance = 0.0;
        }
    }

   
    public void deposit(double amount)
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited Rs." + amount + ". New balance: Rs." + balance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount. Balance remains unchanged.");
        }
    } 
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn Rs." + amount + ". New balance: Rs." + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Balance remains unchanged.");
        }
        else 
        {
            System.out.println("Insufficient funds for withdrawal. Balance remains unchanged.");
        }
    }
    public double getBalance()
    {
        return balance;
    }

    public static void main(String[] args)
    {
        
        Account account1 = new Account();   
        Account account2 = new Account(2000.0);
        account1.deposit(500.0);
        account2.withdraw(200.0);
        System.out.println("Account 1 Balance: $" + account1.getBalance());
        System.out.println("Account 2 Balance: $" + account2.getBalance());
    }
}



