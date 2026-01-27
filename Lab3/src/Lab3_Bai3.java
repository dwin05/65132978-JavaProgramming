import java.util.Scanner;
import java.util.Arrays;

public class Lab3_Bai3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so luong phan tu mang: ");
		int n = input.nextInt();
		
		int[] a = new int[n];
		//nhap mang
		for(int i = 0; i<n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = input.nextInt();
		}
		//sx mang
		Arrays.sort(a);
		
		System.out.print("Mang sau khi sx: ");
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		
		// tim min
		int min = a[0];
		for(int i=0; i<n; i++) {
			if(a[i] < a[0])
				min = a[i];
		}
		System.out.println("\nphan tu nho nhat trong mang: " + min);
		
		// tbc
		int tong = 0;
		int dem = 0;
		for(int i=0; i<n; i++) {
			if(a[i] %3 == 0) {
				tong +=a[i];
				dem++;
			}
		}
		if(dem > 0) {
			double tb = (double)tong/dem;
			System.out.println("tbc cac so chia het cho 3: " +tb);
		}
		else System.out.println("Khong co phan tu nao chia het cho 3!");
	}

}
