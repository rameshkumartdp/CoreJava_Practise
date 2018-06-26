package hibernate.Composite;

import java.io.Serializable;

public class EmployeeBean implements Serializable
{
	String name, department;
	CompKey key;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public CompKey getKey() {
		return key;
	}

	public void setKey(CompKey key) {
		this.key = key;
	}
}
