package factoryPattern;

public class SingleObject {

	private static SingleObject instance = new SingleObject(); 

	private SingleObject(){}
	
	public static SingleObject getinstance(){
		return instance;
	}
	
	public void showMeessage(){
		System.out.println("Hi singleton, alone on the dark " + instance.hashCode());
	}
	
	
}
