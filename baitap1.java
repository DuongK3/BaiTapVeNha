	//--- Khai báo thư viện
import java.util.Scanner;
	public class baitap1 {
	public static void main(String[] args) {
	//--- Khai báo biến	
		int a;
	//--- Nhập giá trị nguyên từ bàn phím
		System.out.print("Nhập số nguyên bất kì: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
	//--- Xét trường hợp và in ra màn hình
		if (a > 0) {
			System.out.println("Số bạn nhập là: "+a+" là số dương"); }
			else {
			System.out.println("Số bạn nhập là: "+a); }
		sc.close();
			}
		}
		

