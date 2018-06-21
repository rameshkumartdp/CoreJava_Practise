package basic;

import sun.reflect.Reflection;

import java.io.*;
import java.lang.reflect.Constructor;

public class Singleton implements Cloneable, Serializable {

	private static volatile Singleton single;

	private Singleton() {
		checkPerMission();
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

	void checkPerMission() {
		Class self = Reflection.getCallerClass(1);
		Class caller = Reflection.getCallerClass(3);
		if (self != caller) {
			throw new IllegalAccessError();
		}
	}

	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();
		Singleton single1 = Singleton.getInstance();
		try {
			System.out.println("with getInstance() --->  "+single.hashCode()+"  "+single1.hashCode() );
			Singleton single2 = (Singleton) single.clone();
			System.out.println("with clone() --->  "+single2.hashCode());
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/rk0000/Ramesh/Code/Practise/src/main/resources/singleton.txt"));
				oos.writeObject(single);

				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/rk0000/Ramesh/Code/Practise/src/main/resources/singleton.txt"));
				Singleton single3 = (Singleton)ois.readObject();
				System.out.println("with Serialization() --->  "+single3.hashCode());

				Class cls = single.getClass();
				Constructor constructor = cls.getDeclaredConstructor();
				constructor.setAccessible(true);

				Singleton single4 = (Singleton) cls.newInstance();
				System.out.println("with Reflection() --->  "+single4.hashCode());

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
	protected Object clone() throws CloneNotSupportedException{
		return single;
	}

	protected Object readResolve() {
		return single;
	}

}
