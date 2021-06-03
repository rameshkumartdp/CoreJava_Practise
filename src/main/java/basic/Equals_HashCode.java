package basic;

import java.util.HashMap;
import java.util.Map;

public class Equals_HashCode {

	String value;
	
	public Equals_HashCode(String value) {
		this.value=value;
	}
	
	@Override
	public int hashCode() {
		return this.value.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof Equals_HashCode)) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		return this.value.equals(((Equals_HashCode) obj).value);
	}

	@Override
	public String toString() {
		return "value:"+value;
	}

	public static void main(String[] args) {
		Equals_HashCode a1 = new Equals_HashCode("green");
		Equals_HashCode a2 = new Equals_HashCode("green");
 
		System.out.println("EQUALS------->   "+a1.equals(a2));
		System.out.println(a1.hashCode()==a2.hashCode());
		
		//hashMap stores Equals_HashCode type and its quantity
		HashMap<Equals_HashCode, Integer> m = new HashMap<Equals_HashCode, Integer>();
		m.put(a1, 10);
		m.put(a2, 20);
		System.out.println(m);
		System.out.println(m.get(new Equals_HashCode("green")));

	}

}
