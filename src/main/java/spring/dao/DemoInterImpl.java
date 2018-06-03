package spring.dao;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class  DemoInterImpl  
{
	private int id;
	private String  name;
	private int  marks;
	
	private NamedParameterJdbcTemplate jd;
	
	public NamedParameterJdbcTemplate getJd() {
		return jd;
	}
	public void setJd(NamedParameterJdbcTemplate jd) {
		this.jd = jd;
	}
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getDetails(){
		String query = "insert into STUDENT values(:id,:name,:marks)";
		MapSqlParameterSource source = new MapSqlParameterSource();
		source.addValue("id",new Integer(102) );
		source.addValue("name","Sunny" );
		source.addValue("marks",new Integer(89) );
		int val = jd.update(query,source);
		return String.valueOf(val);
	}
	
}