package classesAndObjects;

public class movieTestDrive{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Movie movie1 = new Movie();
	movie1.title = "Gone with the Wind";
	movie1.genre = "Adventure";
	movie1.rating = 8;
	
	Movie movie2 = new Movie();
	movie2.title = "Need for Speed";
	movie2.genre = "Action";
	movie2.rating = 5;
	
	Movie movie3 = new Movie();
	movie3.title = "Hello Kitty";
	movie3.genre = "Kids";
	movie3.rating = 3;
	
	System.out.println("The highest rated movie is "+ movie1.title + " which had a rating of "+movie1.rating);
	movie1.playMovie();
	
	
	
	}

}
