package hibernate.Component;

import java.io.Serializable;

public class EmployeeBean implements Serializable
{
	int id;
	String name;
	SalaryDetails details;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SalaryDetails getDetails() {
		return details;
	}

	public void setDetails(SalaryDetails details) {
		this.details = details;
	}
}
