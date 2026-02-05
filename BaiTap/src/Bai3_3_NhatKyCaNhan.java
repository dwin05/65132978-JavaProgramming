import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class Bai3_3_NhatKyCaNhan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap ho ten SV: ");
		String hoTen = input.nextLine();
		
		System.out.print("Nhap MSSV: ");
		String mssv = input.nextLine();
		
		System.out.print("Nhap gmail SV: ");
		String gmail = input.nextLine();
		
		System.out.print("Nhap chieu cao: ");
		double height = input.nextDouble();
		
		System.out.print("Nhap can nang: ");
		double weight = input.nextDouble();
		
		double BMI = (height + weight)/ 2;
		
		try{
			FileWriter writer = new FileWriter("index.txt", true);
			writer.write("Thong tin sinh vien: \n");
			writer.write("\nHo ten SV: " +hoTen);
			writer.write("\nMSSV: " +mssv);
			writer.write("\nGamil: " +gmail);
			writer.write(String.format("\nChieu cao: %.2f", height));
			writer.write(String.format("\nCan nang: %.2f", weight));
			writer.write(String.format("\nBMI: %.2f", BMI));
			writer.close();
		}catch(IOException e) {
			System.out.print("Loi nhap file!");
		}
		
		input.close();
	}
}
