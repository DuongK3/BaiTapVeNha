import java.util.Scanner;
public class baitap7 {

	public static void main(String[] args) {
	String hoten, gioitinh, danhxung;
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhập Họ Tên của bạn: ");
	hoten = sc.nextLine();
	System.out.print("Nhập giới tính của bạn: ");
	gioitinh = sc.nextLine();
	
		if (gioitinh.equalsIgnoreCase("Nam")) { 
			danhxung = "Anh"; 
			System.out.println("Xin chào "+danhxung+ " "+hoten); }
			if (gioitinh.equalsIgnoreCase("Nu")) {
				danhxung = "Chị";
				System.out.println("Xin chào "+danhxung+ " "+hoten); }
		sc.close();
	}
}	
		


