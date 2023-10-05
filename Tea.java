package advance;

class Tea 
{
    public void prepareTea() 
    {
        System.out.println("Preparing basic tea with hot water and tea leaves.");
    }

    public void addMilk()
    {
        System.out.println("Adding milk to the tea.");
    }

    public void addSugar() 
    {
        System.out.println("Adding sugar to the tea.");
    }
}
class BlackTea extends Tea 
{
    
    public void prepareTea() 
    {
        System.out.println("Preparing Black Tea with hot water and black tea leaves.");
    }
}
class GreenTea extends Tea 
{
   
    public void prepareTea()
    {
        System.out.println("Preparing Green Tea with hot water and green tea leaves.");
    }
}
class HerbalTea extends Tea 
{
    
    public void prepareTea() {
        System.out.println("Preparing Herbal Tea with hot water and herbal tea leaves.");
    }


public class TeaArr
{
    public static void main(String[] args) 
    {
       
        Tea[] teai = new Tea[4];
        teai[0] = new Tea();
        teai[1] = new BlackTea();
        teai[2] = new GreenTea();
        teai[3] = new HerbalTea();
        for (Tea tea : teai) {
            tea.prepareTea();
        }
    }
}
}


