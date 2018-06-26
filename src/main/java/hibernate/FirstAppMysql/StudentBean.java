package hibernate.FirstAppMysql;

public class StudentBean
{
	int sid;
	String sname;
	double tot_m;

	public void setSid(int sid)
	{
		this.sid = sid;
	}

	public int getSid()
	{
		return sid;
	}

	public void setSname(String sname)
	{
		this.sname = sname;
	}

	public String getSname()
	{
		return sname;
	}

	public void setTot_m(double tot_m)
	{
		this.tot_m = tot_m;
	}

	public double getTot_m()
	{
		return tot_m;
	}

}
