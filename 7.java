public class Circle {
    
    private double r, PI=3.14;
    public Circle(double radius)
    {
    r=radius;
    }
    public void area(){
    System.out.println("Area of circle ......."+(PI*r*r));
    }
    
} 


package shape;
public class Square 
{
    private double a;
    public Square(double side)
    {
    a=side;
    }
    public void area(){
    System.out.println("Area of Square ......."+(4*a));
    }
    
}


package shape;
public class TriangleOne
{
    private double b,h;
    public TriangleOne(double base, double height)
    {
    b=base; h=height;
    }
   public void area(){
    System.out.println("Area of Triangle ......."+(b*h / 2));
    }
    
}



import shape.*;
public class Lab7 {
    public static void main(String arg[]){
    Circle c=new Circle(20);
    c.area();
    Square s=new Square(15);
    s.area();
   TriangleOne obj = new TriangleOne(12,6);
   obj.area();
    }
}
