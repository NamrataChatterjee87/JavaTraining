
public class HarryPotter_Array {

	public static void main(String[] args) {
		
		
	//Defining the array for Harry potter movies	
	int [] movieSequenceNumber = {1,2,3,4,5,6,7,8};
	String [] movieNames = {"Harry Potter and the Philosopher's Stone" ,"Harry Potter and the Chamber of Secrets", "Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire", "Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince", "Harry Potter and the Deathly Hallows – Part 1", "Harry Potter and the Deathly Hallows – Part 2"};
	int [] releaseYear = {2001,2002,2004,2005,2007,2009,2010,2011};
	
	int i = 0;   //defining array position
	
	//start of for loop
	for (i = 0; i<8; i++) {
		System.out.println (movieSequenceNumber[i] +" " + movieNames[i] + " " +  releaseYear[i]);
	
	} //end of for loop
	}
}
