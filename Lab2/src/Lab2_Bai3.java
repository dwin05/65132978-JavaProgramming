import java.util.Scanner;
public class Lab2_Bai3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so dien: ");
		double sd = input.nextDouble();
		double tien;
		if(sd > 0 && sd <= 50 ) 
			tien = sd*1000;
		else tien = 50*1000 + (sd-50)*1200;
		System.out.print("So tien can tra: " +tien+ " VND");
	}

}
