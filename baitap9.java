import java.util.Scanner;
public class baitap9 {

	public static void main(String[] args) {
		float socu,somoi,dientieuthu,tiendien;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số kW cũ: ");
		socu = sc.nextFloat();
		System.out.print("Nhập số kW mới: ");
		somoi = sc.nextFloat();
		
		dientieuthu = (somoi - socu);
		if (dientieuthu < 0) {
			System.out.println("Lỗi!!! Vui lòng nhập lại(số kW mới phải lớn hơn hoặc bằng số kW cũ)"); }
		else {
			System.out.println("Số điện tiêu thụ là: "+dientieuthu+ " kW"); }
		
		if (dientieuthu < 0) {
			System.out.println("Số tiền điện là: Error!!!"); }
		else {
			if (dientieuthu < 100) {
				tiendien = (dientieuthu*1200); 
				System.out.print("Số tiền điện là: "+tiendien+ " VND"); }
			else if (101 <= dientieuthu & dientieuthu <= 249) {
				tiendien = (dientieuthu*1500); 
				System.out.print("Số tiền điện là: "+tiendien+ " VND"); }
			else if (250 <= dientieuthu & dientieuthu <= 400) {
				tiendien = (dientieuthu*2300); 
				System.out.print("Số tiền điện là: "+tiendien+ " VND"); }
			else if (dientieuthu >= 401) {
				tiendien = (dientieuthu*3000); 
			System.out.print("Số tiền điện là: "+tiendien+ " VND"); }	}	 
	sc.close();
	}
}	
		
				
				
		

