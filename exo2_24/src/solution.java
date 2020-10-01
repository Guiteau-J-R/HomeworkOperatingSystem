/* This is a simple java program that copy the contents of a file to another
 * Author : Groupe 5
 * Date: September 19 2020
 * Use: the user enter the path of the source and the 
 *      destination of the file and the program move it
 */
import java.io.*; // provides for system input and output data streams
import java.nio.file.*; // alternative for IO (new IO)  but is read from a channel into a buffer
import java.util.Scanner; // permit the user write data in the program

public class Move {

	public static void main(String[] args) throws IOException 
	{
		// Using the scanner class to permit the user to enter the file location path
		Scanner in = new Scanner(System.in); 
		// print a message to tell the user to enter the file location
		System.out.println("Enter the path source of your file");
		// put the file location into a string variable
		String source = in.next();
		// print a message to ask the user the destination of the file
		// if the file already exist in the location, the move will fall
		System.out.println("Enter the destination of your file");
		//put the file destination in a string variable
		String destination = in.next();
		
		// We verify if the source file exists
		File sourcefile = new File(source);
		boolean exists = sourcefile.exists();
		
		// create path objects from the source and the destination URI as parameters to use for the move function
		Path sourcePath = Paths.get(source);
		Path destinationPath = Paths.get(destination);
		
		// If the file exists, we execute the copy. Else we print a error message
		if(exists)
		{
			// call the function from the NIO library to actually perform the copy
			// we get the source and the destination. we do not put option so that we can use the default behavior of the function
			// we will put our code in a try statement to get track of the possible errors if the moving failed
			try
			{
				Files.copy(sourcePath, destinationPath); // if the file already exist, the copy will file, but if we put the option REPLACE_EXISTING in the option field, the file is merely replaced		
			}
			catch (IOException e)
			{
				//copying file failed.
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Desole mais votre fichier source n'existe pas");
		}
		

	}

}

