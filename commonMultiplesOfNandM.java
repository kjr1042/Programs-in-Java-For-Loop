import java.util.Scanner;

public class commonMultiplesOfNandM {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int num=scan.nextInt();
		int N=scan.nextInt();
		int M=scan.nextInt();
		int count =0;
		for(int i=1;count<N;i++)
		{
			if(i%N==0 && i%M==0)
			{
				System.out.print(i +" ");
				count++;
				
			}
		}

	}

}
