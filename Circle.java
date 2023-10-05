package advance;
public class Circle {
    private double radius;
    public Circle() 
    {
        this.radius = 1.0; 
    } 
    public Circle(double radius) 
    {
        this.radius = radius;
    }  
    public double calculateCircumference()
    {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) 
    {
       
        Circle circle1 = new Circle();  
        Circle circle2 = new Circle(6.0);     
        System.out.println("Circumference of Circle 1: " + circle1.calculateCircumference());
        System.out.println("Circumference of Circle 2: " + circle2.calculateCircumference());
    }
}



