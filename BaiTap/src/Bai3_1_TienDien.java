import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bai3_1_TienDien{
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so dien: ");
		double sd = input.nextDouble();
		double tien;
		if(sd > 0 && sd <= 50 ) 
			tien = sd*1000;
		else if(sd > 50 && sd <=100)
			tien = 50*1000 + (sd-50)*1200;
		else
			tien = 50*1000 + 50*1200 + (sd-100)*1500;
		System.out.print("So tien can tra: " +tien+ " VND");
		
		input.close();
    }
}