import java.util.Scanner;
public class Lab3_Bai4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap so luong sinh vien: ");
		int n = input.nextInt();
		input.nextLine();
		String[] ten = new String[n];
		double[] diem = new double[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Nhap sinh vien thu " +(i+1));
			System.out.print("Ho ten: ");
			ten[i] = input.nextLine();
			System.out.print("Diem: ");
			diem[i] = input.nextDouble();
			input.nextLine();
		}
		
		// xuat ds ban dau
		for(int i = 0; i<n; i++) {
			System.out.println(" ");
			System.out.println("Ho ten: " +ten[i]);
			System.out.println("Diem: " +diem[i]);
			System.out.println("Hoc luc: " +hocLuc(diem[i]));
		}
		// sx diem tang dan
		for(int i = 0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(diem[i] > diem[j]) {
					double tempDiem = diem[i];
					diem[i] = diem[j];
					diem[j] = tempDiem;
					
					String tempTen = ten[i];
					ten[i] = ten[j];
					ten[j] = tempTen;
				}
			}
		}
		System.out.println("DS sau khi sx tang dan: ");
		for(int i = 0; i<n; i++) {
			System.out.println(" ");
			System.out.println("Ho ten: " +ten[i]);
			System.out.println("Diem: " +diem[i]);
			System.out.println("Hoc luc: " +hocLuc(diem[i]));
		}
		
		input.close();
	}
	
	public static String hocLuc(double diem) {
		if (diem < 5) return "Yếu";
        else if (diem < 6.5) return "Trung bình";
        else if (diem < 7.5) return "Khá";
        else if (diem < 9) return "Giỏi";
        else return "Xuất sắc";
	}

}
