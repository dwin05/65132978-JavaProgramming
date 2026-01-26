import java.util.Scanner;
public class Lab2_Bai1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
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
		input.close();
	}
}
