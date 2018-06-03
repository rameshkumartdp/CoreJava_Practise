package hibernate.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
		private int eid;
		private String ename;
		private int esalary;
		
		private Employee_Dtls emp;
		@Id
		@Column(name="eid")
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ram")
		@SequenceGenerator(name="ram", sequenceName="ram")
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		@Column(name="ename")
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		@Column(name="esalary")
		public int getEsalary() {
			return esalary;
		}
		public void setEsalary(int esalary) {
			this.esalary = esalary;
		}
		
		@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		@JoinColumn(name="edetails_fk")
		public Employee_Dtls getEmp() {
			return emp;
		}
		public void setEmp(Employee_Dtls emp) {
			this.emp = emp;
		}
		
		
}
