package basic;

interface Hello_New  {
	void print();
}

abstract class Hello_Old {
	abstract void hello();
	void getData() {
		System.out.println("GET DATA");
	}
}

class Anonymous  {
	
	public static void main(String[] args) {
		Hello_New anon = () -> {
				System.out.println("Hello WOrld");
		};
		anon.print();
		new Hello_New() {
			public void print(){
				System.out.println("Hello WOrld");
			}
		}.print();
		
		Hello_Old old = new Hello_Old() {
			void hello() {
				System.out.println("Hello");
			}
		};
		old.hello();
		old.getData();
	}

}
