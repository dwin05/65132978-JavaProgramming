import java.util.Scanner;

public class Bai4_Delta {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Nhap a: ");
		int a = input.nextInt();
		
		System.out.print("Nhap b: ");
		int b = input.nextInt();
		
		System.out.print("Nhap c: ");
		int c = input.nextInt();

		System.out.println(" ");
		double delta = Math.pow(b, 2) - 4*a*c;
		System.out.println("Delta = " +delta);
		
		if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Can delta = " + canDelta);
        } else {
            System.out.println("Delta am, khong co can delta trong tap so thuc");
        }

        input.close();
	}

}
