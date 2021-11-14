import java.util.Scanner;
public class baitap5 {

	public static void main(String[] args) {
		int a;
		System.out.print("Nhập số nguyên a: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		if (a == 0) {
			System.out.println(a+" không là số chẵn cũng không là số lẻ"); }
			else if (a % 2 == 0) {
				System.out.print(a+" là số chẵn"); }
		else {
			System.out.print(a+" là số lẻ"); }
	sc.close();
	}
}
