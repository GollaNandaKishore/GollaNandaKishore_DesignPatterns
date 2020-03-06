package StructuralPattern_Bridge;
class RedCircle implements Draw {
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}
class GreenCircle implements Draw {
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}
abstract class Shape {
	   protected Draw draw;
	   
	   protected Shape(Draw drawAPI){
	      this.draw = drawAPI;
	   }
	   public abstract void draw();	
	}
class Circle extends Shape {
	   private int x, y, radius;

	   public Circle(int x, int y, int radius, Draw drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void draw() {
	      draw.drawCircle(radius,x,y);
	   }
	}
public class BridgePatternDemo {
	   public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	   }
	}
