// ax^2 +bx + c = 0
import java.util.Scanner;
public class Lab2_Bai2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
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
		input.close();
	}
}
