abstract class Shape{
    abstract double area();
    abstract double perimeter();
    String color;
    Shape(String color){
        System.out.println("Shape Constructer called");
        this.color = color;
    }
    
}

class Circle extends Shape{
    int radius;
    Circle(int radius,String color){
        super(color);
        System.out.println("Circle constructor called");
       
        this.radius = radius;
    }
    @Override double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override double perimeter(){
        return 2*Math.PI*radius;
    }
}


public class Abstraction
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Shape circle = new Circle(10,"Red");
		System.out.println(circle.area());
		System.out.println(circle.perimeter());
	}
}