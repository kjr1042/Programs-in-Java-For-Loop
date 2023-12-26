import java.util.Scanner;

public class highestCommonFactor_HCF {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=n;i>=1;i--)
		{
			if(n%i==0)
			{
				System.out.print(i +" ");
				break;
			}
		}

	}

}
