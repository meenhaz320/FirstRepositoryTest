package methodsAndInstanceVariables;

public class ElectricGuitarTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ElectricGuitar banjo = new ElectricGuitar();
	ElectricGuitar ukelele = new ElectricGuitar();
	
	banjo.brand = "Redneck";
	banjo.numOfPickups = 3;
	banjo.rockStarUsesIt = false;
	
	ukelele.brand = "Hawaiian";
	ukelele.numOfPickups  = 4;
	banjo.rockStarUsesIt = true;
	
	System.out.println(banjo.getBrand());
	
	banjo.setBrand("LaalNeck");
	
	System.out.println(banjo.getBrand());
	
	ukelele.getNumOfPickUps();
	
	

		
		
	}}
