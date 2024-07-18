package com.democode;
import java.util.Scanner;
public class Statussystemlord extends luubien implements Featuresystemlord {
	
	
	
	protected static char selection;
	double status;
	double pointst = 10;
	public Statussystemlord() {
	
		
		
			
	}
	
	@Override
	public void showst() {
		System.out.println("HP:"+ hp);
		System.out.println("MP:"+ mp);
		System.out.println("ATK:" + atk);
		System.out.println("DEF:" + def);
	}
    
	public double getPointst() {
		pointst -= x;
		return pointst;
	}
	        
		
	public double resetPointst() {
		pointst += x;
		return pointst;
	}

	@Override
	public void gioithieusystem() {
		// TODO Auto-generated method stub
		
	}

	

	

	@Override
	public void luachonstatus() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
