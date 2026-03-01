import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		for (int i=0;i<T;i++){
		    int x=input.nextInt();
		    if (x<=15){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
