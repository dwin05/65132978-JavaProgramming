import java.util.Scanner;
public class Lab2_Bai4 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {	
		int chon;
		do {
			chon = menu();
			switch(chon) {
			case 1: Bai1(); break;
			case 2: Bai2(); break;
			case 3: Bai3(); break;	
			case 4: System.out.println("Dung chuong trinh!");break;
			default: System.out.println("Chuc nang khong hop le!");
			}
		}while(chon != 4);
	}
	
	static int menu() {
		System.out.println(" ");
		System.out.println("1. Giai phuong trinh bac 1");
		System.out.println("2. Giai phuong trinh bac 2");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Ket thuc");
		System.out.print("Chon chuc nang: ");
		return input.nextInt();
	}
	
	static void Bai1() {
		System.out.println("Giai pt bac 1");
		
		System.out.print("Nhap a: ");
		int a = input.nextInt();
		
		System.out.print("Nhap b: ");
		int b = input.nextInt();
		
		if(a == 0) {
			if(b ==0) 
				System.out.println("Phuong trinh co vo so nghiem!");
			else System.out.println("Phuong trinh vo nghiem!");
		}
		else {
			double nghiem = -b/a;
			System.out.println("Nghiem cua phuong trinh: " + nghiem);
		}	
	}
	static void Bai2() {
		System.out.println("Giai pt bac 2");
		
		System.out.print("Nhap a: ");
		double a = input.nextDouble();
		System.out.print("Nhap b: ");
		double b = input.nextDouble();
		System.out.print("Nhap c: ");
		double c = input.nextDouble();
		double nghiem = -c/b;
		
		if(a == 0) 
			System.out.print("Nghiem cua pt: " +nghiem);
		else {
			double delta = Math.pow(b, 2)- 4*a*c;
			System.out.println("Delta = " +delta);
			if(delta < 0) 
				System.out.println("Pt vo nghiem!");
			else if(delta == 0)
				System.out.println("Pt co nghiem kep: x = " +nghiem);
			else {
				double x1 = (-b + Math.sqrt(delta)) / 2*a;
				double x2 = (-b - Math.sqrt(delta)) / 2*a;
				System.out.println("Pt co nghiem phan biet: x1 = " +x1);
				System.out.println("Pt co nghiem phan biet: x2 = " +x2);
			}
		}
	}
	static void Bai3() {
		System.out.println("Tinh tien dien");
		
		System.out.print("Nhap so dien: ");
		double sd = input.nextDouble();
		double tien;
		if(sd > 0 && sd <= 50 ) 
			tien = sd*1000;
		else tien = 50*1000 + (sd-50)*1200;
		System.out.print("So tien can tra: " +tien+ " VND");
	}
}
