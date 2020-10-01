package exo4_22;

public class Minimum implements Runnable {
	private int[] numbers; // integer array
	private int minimum; // minimum variable
	//constructor of the class
	public Minimum(int[] numbers){
		this.numbers = numbers;
		minimum = 0;
	}
	
	//run method where we find the minimum number
	public void run(){
		minimum = numbers[0];
		for(int i = 1; i < numbers.length; i++){
			if(minimum > numbers[i]) minimum = numbers[i];
		}
		System.out.println("Minimum: " + minimum);
	}
}
