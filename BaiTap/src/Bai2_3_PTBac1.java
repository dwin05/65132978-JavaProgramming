import java.util.Scanner;
public class Bai2_3_PTBac1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a  = input.nextInt();
		System.out.print("Nhap b: ");
		int b  = input.nextInt();
		
		if(a==0) System.out.println("Pt vo nghiem!");
		else if (a==0 && b==0) System.out.println("Pt vo so nghiem!");
		else System.out.print("Nghiem cua pt: " +(-b/a));
		
		input.close();
	}

}
