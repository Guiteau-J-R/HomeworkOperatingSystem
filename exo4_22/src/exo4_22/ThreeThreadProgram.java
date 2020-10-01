package exo4_22;

public class ThreeThreadProgram {
	public static void main(String[] args){
		int [] numbers = new int[args.length]; //create an integer array to the same size with the parameter args

		//using try to avoid errors converting String to integer
		try{
			//verifying that args is not empty
			if(args.length != 0){
		        for(int i = 0; i < args.length; i++){
			        numbers[i] = Integer.parseInt(args[i]);//converting String to Integer
		        }
		        //Creating new classes
		        Average average = new Average(numbers);
		        Minimum minimum = new Minimum(numbers);
		        Maximum maximum = new Maximum(numbers);
		        
		        //Creating new threads
		        Thread t1 = new Thread(average);
		        Thread t2 = new Thread(minimum);
		        Thread t3 = new Thread(maximum);
		        
		        //Starting the threads
		        t3.start();
		        t2.start();
		        t1.start();
			}
			else System.out.println("No number was entered");//Printing a message
		}
		catch(NumberFormatException nfe){
			System.out.println("You entered a non numeric character.");//Printing an error
		}
	}
}
