import java.util.Scanner;

public class pratica01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE UM NÚMERO : ");
		
		int n;
		n = sc.nextInt();
		
		System.out.println("Quantidades de números que devem ser lidos: " + n);
		
		for(int i = 0;i < n;i++) {
			int x = 0;
			x = i % n *2 ;
		
		System.out.println("Número  : " + x);	
		
		}
		
		
		sc.close();

	}
}

