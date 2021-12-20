import java.util.Scanner;
public class BilanganFibonacci {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Input banyaknya deret bilangan fibonacci = ");
		int batas = input.nextInt();
		int a = 0, b = 1, c = 0, deret=0;
		System.out.print(a+" "+b+" ");
		for (c = 2; c<=batas; c++) {
		deret = a + b;
		a = b;
		b = deret;
		System.out.print(deret+" ");
		}
	
	}
}
