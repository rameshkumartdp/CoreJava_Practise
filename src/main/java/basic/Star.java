package basic;

public class Star {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=i+1;j>1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=10;i>1;i--) {
			for(int j=1;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<(2*i); k++){
                System.out.print("*");
            }
			System.out.println();
		}
	}

}
