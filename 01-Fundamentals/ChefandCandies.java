import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		for (int i=0;i<T;i++){
		    int N=input.nextInt();
		    int X=input.nextInt();
		    if (X>=N){
		        System.out.println(0);
		    }
		    else{
		        int extra=N-X;
		        int packets=extra/4;
		        if (extra%4!=0){
		            packets++;
		        }
		        System.out.println(packets);
		    }
		}
	}
}