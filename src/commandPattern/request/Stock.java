package commandPattern.request;

public class Stock {
	public String name = "ABC";
	public int quantity = 10;
	
	public void buy(){
		System.out.println("Stock [ name: "+name+", quantity: "+quantity+" ] bought");
	}
	
	public void sell(){
		System.out.println("Stock [ name: "+name+", quantity: "+quantity+" ] sold");
	}
}
