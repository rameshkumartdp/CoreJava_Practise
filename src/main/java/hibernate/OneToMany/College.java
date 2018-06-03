package hibernate.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {
		private int cid;
		private String cname;
		private String regNo;
		private List<Student> student;
		@Id
		@Column(name="cid")
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ram")
		@SequenceGenerator(name="ram", sequenceName="ram")
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		@Column(name="cname")
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		@Column(name="reg_no")
		public String getRegNo() {
			return regNo;
		}
		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}
		@OneToMany(mappedBy="coll", targetEntity=Student.class,cascade=CascadeType.ALL)
		public List<Student> getStudent() {
			return student;
		}
		public void setStudent(List<Student> student) {
			this.student = student;
		}
		
}
