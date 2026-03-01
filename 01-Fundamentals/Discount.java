import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		for (int i=0;i<T;i++){
		    int discount = input.nextInt();
		    int price= 100-discount;
		    System.out.println(price);
		}
	}
}
