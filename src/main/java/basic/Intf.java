package basic;

public  class Intf  {
	public static void main(String[] args) {
		Intf inf = new Intf();
		System.out.println(inf.getClass().getMethods().length);
	}
}
