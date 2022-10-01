import java.util.Scanner;
public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n;
		Scanner s=new Scanner (System.in);
		n=s.nextLong();
		s.close();
//		System.out.println(n);
		long i=1;
		int sum=0;
		while(n>0) {
//			
			long num=n%2;
			sum+=(num*i);
			n/=2;
			
			i*=10;
		}
		System.out.print(sum);
	}

}
