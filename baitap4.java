import java.util.Scanner;
public class baitap4 {
	public static void main (String[] args) {
		int a;
		System.out.print("Nhập số nguyên a: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a > 0) {
			System.out.print(a+" là số dương"); }
			else if (a < 0) {
				System.out.print(a+" là số âm"); }
		else {
			System.out.print(a+" không là số dương cũng không là số âm"); }
	sc.close();
	}
}
