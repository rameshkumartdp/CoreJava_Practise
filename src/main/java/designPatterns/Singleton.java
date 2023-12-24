package designPatterns;

import java.io.*;
import java.lang.reflect.Constructor;

public class Singleton implements Cloneable, Serializable {

	private static volatile Singleton single;

	private Singleton() {
		System.out.println("Constructor called ---> ");
		if(single != null) {
			try {
				throw new RuntimeException("Cannot create another object");
			} catch(RuntimeException e) {
				e.printStackTrace();
			}
		}
	}

	public static Singleton getInstance() {
		if (single == null) {
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
			System.out.println("with getInstance() --->  "+single.hashCode()+"  "+single1.hashCode() );
			Singleton single2 = single.clone();
			System.out.println("with clone() --->  "+single2.hashCode());
			try {
				String fileName = "D:\\Ramesh\\Practise\\src\\main\\resources\\files\\singleton.txt";
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
				oos.writeObject(single);

				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
				Singleton single3 = (Singleton)ois.readObject();
				System.out.println("with Serialization() --->  "+single3.hashCode());

				Class cls = single.getClass();
				Constructor constructor = cls.getDeclaredConstructor();
				constructor.setAccessible(true);

				Singleton single4 = (Singleton) cls.newInstance();
				System.out.println("with Reflection() --1-->  " + single4.hashCode());

				Class cls1 = Singleton.class;
				Constructor constructor1 = cls1.getDeclaredConstructor();
				constructor1.setAccessible(true);

				Singleton single5 = (Singleton) cls1.newInstance();
				System.out.println("with Reflection() --2-->  " + single5.hashCode());
			} catch(IOException e) {
				e.printStackTrace();
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
			} catch(NoSuchMethodException e) {
				e.printStackTrace();
			} catch(InstantiationException e) {
				e.printStackTrace();
			} catch(IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Singleton clone() throws CloneNotSupportedException{
		return single;
	}

	protected Object readResolve() {
		return single;
	}
}
