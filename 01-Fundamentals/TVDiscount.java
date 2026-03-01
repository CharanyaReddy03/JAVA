import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		for (int i=0;i<T;i++){
		    int firstprice=input.nextInt();
		    int secondprice=input.nextInt();
		    int firstdiscount=input.nextInt();
		    int seconddiscount=input.nextInt();
		    int first=firstprice-firstdiscount;
		    int second=secondprice-seconddiscount;
		    if (first<second){
		        System.out.println("First");
		    }
		    else if (first>second){
		        System.out.println("Second");
		    }
		    else{
		        System.out.println("Any");
		    }
		}
	}
}