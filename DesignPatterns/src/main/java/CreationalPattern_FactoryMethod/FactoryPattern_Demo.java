package CreationalPattern_FactoryMethod;
class Factory 
{
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null;
	   }
}
class Circle implements Shape 
{
	   public void draw() {
	      System.out.println("draw() method inside circle");
	   }
}
class Square implements Shape 
{
	   public void draw() {
	      System.out.println("draw() method inside Square");
	   }
}
class Rectangle implements Shape 
{
	   public void draw() {
	      System.out.println("draw() method inside Rectangle");
	   }
}
public class FactoryPattern_Demo {
	public static void main(String[] args) {
	      Factory factory = new Factory();
	      Shape shape1 = factory.getShape("CIRCLE");
	      shape1.draw();
	      Shape shape2 = factory.getShape("RECTANGLE");
	      shape2.draw();
	      Shape shape3 = factory.getShape("SQUARE");
	      shape3.draw();
	   }
}
