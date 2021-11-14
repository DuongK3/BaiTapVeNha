import java.util.Scanner;
public class baitap2 {
	public static void main(String[] args) {
		int a,b,c;
		System.out.print("Nhập số nguyên thứ nhất: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.print("Nhập số nguyên thứ hai: ");
		b = sc.nextInt();
		System.out.print("Nhập số nguyên thứ ba: ");
		c = sc.nextInt();
		if(a==b && a==c && b==c) {
			System.out.printf("%d, %d, %d ",a,b,c); }
		
		if(a==b && a>c && b>c) {
            System.out.printf("%d là số lớn nhất",a); }	
		
		if(a==c && a>b && c>b) {
			System.out.printf("%d là số lớn nhất",a); }
		
		if(b==c && b>a && c>a) {
			System.out.printf("%d là số lớn nhất",b); }
		
		if (a>b && a>c) { 
			System.out.print(a+" là số lớn nhất"); }
		
		if(b>a && b>c) {
			System.out.print(b+" là số lớn nhất"); }
		
		if(c>a && c>b) {
			System.out.print(c+" là số lớn nhất"); }
			sc.close();
	}
}	
		
	
