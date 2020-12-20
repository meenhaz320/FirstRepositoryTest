package javaBasics;

public class BeerOnTheWall14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x = 99;
	String word = "bottles";
	
	while(x > 0) {
		if (x == 1) {
			word = "bottle";
		}
		System.out.println(x+ " "+  word + " of beer on the wall");
		System.out.println(x +" "+ word+" of beer, take one down pass it around");
		x = x-1;
		System.out.println(x +" "+ word+ " of beer on the wall");
	}
	}

}
