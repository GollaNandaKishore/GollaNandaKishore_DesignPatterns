package CreationalPattern_Singleton;
class SingleTon
{
	   private static SingleTon instance = new SingleTon();
	   private SingleTon(){}
	   static SingleTon getInstance(){
	      return instance;
	   }

	   void showMessage()
	   {
	      System.out.println("Singleton Pattern Demo");
	   }
}
public class SingletonPattern_Demo 
{
	public static void main(String[] args) {

	      SingleTon object = SingleTon.getInstance();
	      object.showMessage();
	   }
}
