package collections;

public class Generic_Demo<E> {
	private E e;
	public  E  get() {
		return e;
	}
	public  void set(E e) {
		this.e=e;
	}

	public static void main(String[] args) {
		Generic_Demo<String> demo = new Generic_Demo<String>();
		demo.set("hello");
		demo.set("java");
		System.out.println(demo);
	}

}
