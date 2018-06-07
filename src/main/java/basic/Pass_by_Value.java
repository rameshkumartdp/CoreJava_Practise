package basic;

import java.util.ArrayList;
import java.util.List;

public class Pass_by_Value {

	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void change(int val) {
		val = 2000;
	}

	public static void main(String[] args) {
		Pass_by_Value pv = new Pass_by_Value();
		pv.setName("Hello");
		List myList = new ArrayList();
		int single = 1000;
		pv.change(single);
		System.out.println(single);
	}

}
