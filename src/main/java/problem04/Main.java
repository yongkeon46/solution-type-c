package problem04;

public class Main {
	public static void main(String[] args) {
		
		
		for(int i=2; i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.printf("%3d * %3d = %3d",i,j,i*j);
			}
			System.out.println();
		}
		 
	}
}