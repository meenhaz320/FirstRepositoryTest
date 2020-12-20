package javaBasics;

public class PhraseOMatic16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "frontend", "web-based", "pervasive", 
				"smart", "six-signma", "critical-path", "dynamic"};
		
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric"};
		
		//find out how many words are in each list
		//generte three random numbers 
		//build a prhase from two strings
		//print out prhase
		
		int length1 =  wordListOne.length;
		int length2 = wordListTwo.length;
		
		System.out.println("The lengths of list 1 and list 2 are "+length1+" and "+length2);
		
		int rand1 = (int) (Math.random() * length1);
		int rand2 = (int) (Math.random() * length2);
		
		System.out.println(rand1 +" and "+ rand2);
		
		String prhase = wordListOne[rand1] + " "+ wordListTwo[rand2];
		
		System.out.println("What we need is a "+ prhase);
		
		int x = (int) 24.6;
		System.out.println(x);
		}

	}


