package pyramid;

public class PrintStars {

	public static void main(String[] args) {
		printStarsmethod(5);

	}

	public static void printStarsmethod(int n){
	
		/*for( i=0;i<n;i++){
			
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*for(i=n;;i--){
			for(j=0;j<=i;j++){
				System.out.println("*");
			}
			System.out.println();
		}*/
		for (int i=0;i<=5;i++) {

			for (int j=0;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println();
			}

			
	}
	
}
