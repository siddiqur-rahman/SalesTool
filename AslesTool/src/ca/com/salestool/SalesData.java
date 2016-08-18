package ca.com.salestool;

public class SalesData {
	int data[]={0,4,42};
	
	public void display(){
		System.out.println("Data: ");
		for(int i: data){
			System.out.println("next value: "+i);
		}
		System.out.println("So the sum is: "+sum());
	}
	public int sum(){
		int sum=0;
		for(int i:data)
			sum+=i;
		return sum;
	}
	public int max(){
		int max=data[0];
		for(int i: data){
			if(max<i)
				max=i;
		}
		return max;
	}
	public int min(){
		int small=data[0];
		for(int i: data){
			if(small>i)
				small=i;
		}
		return small;
	}
}
