import java.util.Scanner;
public class baitap6 {

	public static void main(String[] args) {
		float dtb;
		System.out.print("Nhập điểm trung bình của bạn: ");
		Scanner sc = new Scanner(System.in);
		dtb = sc.nextFloat();
		
		if ( dtb >= 5 & dtb <= 10 ) {
			System.out.println("Điểm: "+dtb+" --> Kết quả: Đạt"); }
			else if (dtb > 0 & dtb < 5) {
				System.out.println("Điểm: "+dtb+" --> Kết quả: Không Đạt"); }
		else {
			System.out.print("Điểm không hợp lệ"); }
	sc.close();
	}
}
