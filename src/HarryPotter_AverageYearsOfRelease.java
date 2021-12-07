
public class HarryPotter_AverageYearsOfRelease {

	public static void main(String[] args) {
		

		//Harry Potter first movie released
		int firstReleaseYear = 2001;
		
		//Harry Potter last movie released
		int lastReleaseYear = 2011;
		
		//Total number of Harry Potter movies release over the years
		int totalNumberofRelease = 8;
		
		//Approximate average time for a movie release = (Last movie Release Year – First Movie Release year) / Total Number of Movies in Years
		int averageYearsOfRelease = (lastReleaseYear - firstReleaseYear)/ totalNumberofRelease ;
		
		//Approximate average time for a movie release = (Last movie Release Year – First Movie Release year) / Total Number of Movies in Months
		int remainder = (lastReleaseYear - firstReleaseYear) % totalNumberofRelease ;
		
		
		System.out.println("Approx years for a Harry Potter movie to release is :" +averageYearsOfRelease + " Year " +remainder + " Months");

	}

}
