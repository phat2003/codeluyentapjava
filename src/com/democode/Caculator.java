package com.democode;
import java.util.Scanner;

public class Caculator {
	
	
	public static void main(String[] args) {
		
		
		Scanner nhap = new Scanner(System.in);
		
		
		double a;
		double b;
		a = nhap.nextDouble();
	    char pheptinh = nhap.next().charAt(0);//check ký tự index đầu tiên nhập vào.
	    b = nhap.nextDouble();
	    
	    
	    
	    
		
		
		
		
		
		switch(pheptinh) {
		
		case '+':
			double ketqua = a + b;
			
			System.out.println(a + "+" + b +"=" + ketqua);
			break;
		case '-':
			ketqua = a - b;
			System.out.println(a + "-" + b +"=" + ketqua);
			break;
		case '*':
			ketqua = a * b;
			System.out.println(a + "*" + b +"=" + ketqua);
			break;
		case '/':
			ketqua = a / b;
			System.out.println(a + "/" + b +"=" + ketqua);
			break;
		case '%':
			ketqua = a % b;
			System.out.println(a + "%" + b +"=" + ketqua);
			break;
		}

	}

}