package com.democode;
import java.util.Scanner;
public class inmethod extends luubien implements Featuresystemlord {
	
	Scanner nhapinmethod = new Scanner(System.in);
	
	@Override
	public void gioithieusystem() {
		System.out.println("Chào mừng bạn đến với hệ thống chúa tể huỷ diệt");
		System.out.println("1. status");
		System.out.println("2. quest");
		
		System.out.print("Choose selection:");
		Object[] selection = new Object[3];
		
		super.selection = nhapinmethod.next();
		
		
			int n = Integer.parseInt(super.selection);
		
		
		
		
		
		
		
		
		
		for (int i = 0;i < selection.length;i += n) {
			selection[0] = n;
			selection[1] = n;
			selection[2] = n;
			if (selection[i] instanceof Integer) {
		    switch(n) {
		    case 1:
			
				Thread.yield();
				showst();
			
			
			break;
		    case 2:
			
			
				Thread.yield();
				gioithieusystem();
			break;
		    }
		    } else {
			System.out.println("Invalid");
		    }
			break;
		} 
		
		
	}

	@Override
	public void showst() {
		System.out.println("HP:"+ hp);
		System.out.println("MP:"+ mp);
		System.out.println("ATK:" + atk);
		System.out.println("DEF:" + def);
		
		System.out.println("bạn có muốn thay đổi status không?");
		System.out.println("Yes");
		System.out.println("No");
		System.out.print("nhập lựa chọn: ");
		super.selection = nhapinmethod.next();
		
		switch(super.selection) {
		case "y":
			
			
					System.out.print("nhập x: ");
					x = nhapinmethod.nextDouble();
					if (x > 0 ) {
						System.out.print("bạn muốn nâng thuộc tính nào: ");
						selectionst = nhapinmethod.next();
						switch(selectionst) {
						case "hp":
							hp += x;
							break;
						case "mp":
							mp += x;
							break;
						case "atk":
							atk += x;
							break;
						case "def":
							def += x;
							break;
						}
						
						
					} else {
						System.out.println("điểm thuộc tính ko đủ");
					}
					System.out.println("HP:"+ hp);
					System.out.println("MP:"+ mp);
					System.out.println("ATK:" + atk);
					System.out.println("DEF:" + def);
					Thread.yield();
					showst();
					break;
					
		case "n":
			Thread.yield();
			gioithieusystem();
			break;
			
		}
	}
			
			
		
		
		
	

	

	@Override
	public void luachonstatus() {
		// TODO Auto-generated method stub
		
	}

	
	
}

