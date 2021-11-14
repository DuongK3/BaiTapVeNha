import java.util.Scanner;
public class baitap8 {

	public static void main(String[] args) {
		float dtb;
		System.out.print("Nhập điểm trung bình của bạn: ");
		Scanner sc = new Scanner(System.in);
		dtb = sc.nextFloat();
	
		if ( dtb == 10 ) {
			System.out.println("Điểm: "+dtb+" --> Xếp loại: Xuất sắc"); }
		else if (dtb >= 8 & dtb < 10) {
			System.out.println("Điểm: "+dtb+" --> Xếp loại: Giỏi"); }
		else if (dtb >= 7 & dtb < 8) {
			System.out.println("Điểm: "+dtb+" --> Xếp loại: Khá"); }
		else if (dtb >= 5 & dtb < 7) {
			System.out.println("Điểm: "+dtb+" --> Xếp loại: Trung bình"); }
		else if (dtb >= 0 & dtb < 5) {
			System.out.println("Điểm: "+dtb+" --> Xếp loại: Yếu"); }	
		else {
			System.out.println("Điểm không hợp lệ"); }
	sc.close();
	}
}