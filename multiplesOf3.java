import java.util.Scanner;

public class multiplesOf3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int count=0;
		for(int i=1;count<n;i++)
		{
			if(i%3==0)
			{
				System.out.print(i +" ");
				count++;
			}
		}


	}

}
