package collections;

public class Generic_Demo<E> {
	private E e;
	public E get(E e) {
		return e;
	}
	public void set(E e) {
		this.e=e;
	}

	public static void main(String[] args) {
		Generic_Demo<Integer> demo = new Generic_Demo<>();
		demo.set(1);
		demo.set(2);
		System.out.println(demo.get(2));
	}

}
