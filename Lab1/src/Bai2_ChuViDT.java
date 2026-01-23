import java.util.Scanner;
public class Bai2_ChuViDT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap chieu dai: ");
		double chieuDai = input.nextDouble();
		
		System.out.print("Nhap chieu rong: ");
		double chieuRong = input.nextDouble();
	          
		System.out.println("");
		System.out.println("Dien tich hinh chu nhat: " + chieuDai * chieuRong);
		System.out.println("Chu vi hinh chu nhat: " + (chieuDai + chieuRong) *2);
		
		double canhNho = (chieuDai > chieuRong) ? chieuDai: chieuRong;
		System.out.println("Canh nho cua hinh chu nhat: " + canhNho);
		
		input.close();
	}	
}
