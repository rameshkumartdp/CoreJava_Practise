package basic;

public class Singleton implements Cloneable {

	private static volatile Singleton single;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (single== null) {
			synchronized (Singleton.class) {
				if (single == null) {
					single = new Singleton();
				}
			}
		}
		return single;
	}

	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();
		Singleton single1 = Singleton.getInstance();
		try {
			System.out.println(single.hashCode()+"  "+single1.hashCode() );
			//System.out.println(single1.hashCode());
			Singleton single2 = (Singleton) single.clone();
			System.out.println(single2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		return new CloneNotSupportedException("");
	}


}
