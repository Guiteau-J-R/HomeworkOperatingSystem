package exo4_22;

public class Maximum implements Runnable{
	int[] numbers;//integer array
	int maximum;//variable maximum
	//constructor of the maximum class
	public Maximum(int[] numbers){
		this.numbers = numbers;
		maximum = 0;
	}
	//run method where we find the maximum number
	public void run(){
		for(int i = 0; i < numbers.length; i++){
			if(maximum < numbers[i]) maximum = numbers[i];
		}
		System.out.println("Maximum: " + maximum);
	}
}
