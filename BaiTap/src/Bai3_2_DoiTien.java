import java.util.Scanner;

public class Bai3_2_DoiTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap so tien can doi: ");
        double tien = input.nextDouble();
        input.nextLine(); 
        
        System.out.print("Chon loai tien muon doi sang (VND/USD): ");
        String loai = input.nextLine();
        
        double ketQua;
        
        if (loai.equalsIgnoreCase("VND")) {
            ketQua = tien * 25000;
            System.out.print(tien + " USD -> VND: " + ketQua);
        } 
        else if (loai.equalsIgnoreCase("USD")) {
            ketQua = tien / 25000;
            System.out.print(tien + " VND -> USD: " + ketQua);
        } 
        else {
            System.out.print("Loai tien khong hop le!");
        }
        
        input.close();
    }
}