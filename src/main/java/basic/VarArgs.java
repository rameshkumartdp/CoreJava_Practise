package basic;

public class VarArgs {

	public static void main(String[] args) {
		VarArgs arg = new VarArgs();
		arg.display("hello","hi");
		arg.display("hello");
	}
	
	public void display(String... value) {
		for(String str:value) {
			System.out.println("---->   "+str);
		}
	}

}
