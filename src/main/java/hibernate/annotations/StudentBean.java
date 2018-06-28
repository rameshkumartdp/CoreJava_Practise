package hibernate.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentBean
{
	int sid;
	String sname;
	double tot_m;

	public void setSid(int sid)
	{
		this.sid = sid;
	}

	@Id
	@Column(name="sid")
	public int getSid()
	{
		return sid;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	@Column(name="sname")
	public String getSname()
	{
		return sname;
	}

	public void setTot_m(double tot_m)
	{
		this.tot_m = tot_m;
	}

	@Column(name="tot_m")
	public double getTot_m()
	{
		return tot_m;
	}

}
