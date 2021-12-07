import java.util.Scanner;

public class HarryPotter_NewInputArray {

	public static void main(String[] args) {
		
		
	//Defining the array for Harry potter movies	
		int [] movieSequenceNumber;
		movieSequenceNumber=new int[5]; 
		String [] movieNames;
		movieNames= new String[5];
		int [] releaseYear;
		releaseYear= new int[5];
		 
		Scanner scan = new Scanner(System.in);
		
	//start of for loop for input
		for (int count = 0; count<=4; count++)
		{                
            //Used to enter data
			movieSequenceNumber[count] = count+1;
            System.out.println("Enter the name of Movie " + movieSequenceNumber[count]+":");
            movieNames[count] = scan.next();
            
            System.out.println("Release Year :");
            releaseYear[count] = scan.nextInt();
        }
		
		int i = 0;   //defining array position
		
		//start of for loop
		for (i = 0; i<=4; i++) {
			System.out.println ( movieSequenceNumber[i] +") " + movieNames[i] + " " +  releaseYear[i]);
		
		} //end of for loop
		
	}
}
