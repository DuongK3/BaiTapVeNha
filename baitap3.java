import java.util.Scanner;
public class baitap3 {

	public static void main(String[] args) {
	int a,b,tong,hieu,tich;
	float thuong;
	
	System.out.print("Nhập số nguyên thứ nhất: ");
	Scanner sc = new Scanner(System.in);
	a = sc.nextInt();
	System.out.print("Nhập số nguyên thứ hai: ");
	b = sc.nextInt();
	
	tong = a + b;
	hieu = a - b;
	tich = a * b;
	
	if (b != 0) {
		thuong = (float)a / b;
		System.out.println("a + b = "+tong);
		System.out.println("a - b = "+hieu);
		System.out.println("a x b = "+tich);
		System.out.println("a / b = "+thuong); }
		else { 
			System.out.println("a + b = "+tong);
			System.out.println("a - b = "+hieu);
			System.out.println("a x b = "+tich); }
	sc.close();							
			
	}	
}

