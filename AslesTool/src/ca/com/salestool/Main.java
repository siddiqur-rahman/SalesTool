package ca.com.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data=new SalesData();
		displayGreeting();
		data.display();

	}
	private static void displayGreeting(){
		System.out.println("hello happy sales people!");
		System.out.println("This app shows sales data.");
		System.out.println("---------------------------");
		
		System.out.println("test 1");
		System.out.println("test 2");
	}

}
