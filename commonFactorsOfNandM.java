import java.util.Scanner;

public class commonFactorsOfNandM {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int M=scan.nextInt();
		for(int i=1;i<=N;i++)
		{
			if(N%i==0 && M%i==0)
			{
				System.out.print(i +" ");
				//break;
			}
		}

	}

}
