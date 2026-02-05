import java.util.Scanner;
public class Bai2_1_TinhTienLuong {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so gio lam: ");
		float gioLam = input.nextFloat();
		System.out.print("Nhap so luong theo gio: ");
		float luongH = input.nextFloat();
		
		double tongLuong;
		if(gioLam > 40) 
			tongLuong = 40*luongH + ((gioLam-40)*1.5)*luongH;
		else tongLuong = gioLam * luongH;
		System.out.println("\nLuong: " + String.format("%.2f", tongLuong));
		
		input.close();
	}
}
