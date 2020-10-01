package exo4_22;

public class Average implements Runnable{
	int[] numbers;// integer array
	int average;// average variable
	//constructor of the class
	public Average(int[] numbers){
		this.numbers = numbers;
		average = 0;
	}
	
	// the run method where the average is calculated
	public void run(){
		for(int i = 0; i < numbers.length; i++){
			average += numbers[i];
		}
		average = average/numbers.length;
		System.out.println("Average: " + average);
	}
}
