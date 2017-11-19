package mediatorPattern;

import mediatorPattern.impl.User;

public class MediatorPatternDemo {
	public static void main (String...strings){
		User robert = new User("Robert");
		User john = new User("John");
		
		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
