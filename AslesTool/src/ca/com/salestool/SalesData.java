package ca.com.salestool;

public class SalesData {
	int data[]={0,4,42};
	
	public void display(){
		System.out.println("Data: ");
		for(int i=0;i<data.length;i++){
			System.out.println("next value: "+data[i]);
		}
	}
}
