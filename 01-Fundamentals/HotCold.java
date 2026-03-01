import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int i=0;i<T;i++){
	        int x=sc.nextInt();
	        if (x>20){
	            System.out.println("Hot");
	        }
	        else{
	            System.out.println("Cold");
	        }
	    }
	    
}
}