package hibernate.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="employee_dtls")
public class Employee_Dtls {
		private int eval;
		private String edept;
		private String eproject;
		private Employee emp;
		
		@OneToOne(mappedBy="emp",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
		public Employee getEmp() {
			return emp;
		}
		public void setEmp(Employee emp) {
			this.emp = emp;
		}
		@Id
		@Column(name="eval")
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="ram")
		@SequenceGenerator(name="ram", sequenceName="ram")
		public int getEVal() {
			return eval;
		}
		public void setEVal(int eval) {
			this.eval = eval;
		}
		@Column(name="edept")
		public String getEdept() {
			return edept;
		}
		public void setEdept(String edept) {
			this.edept = edept;
		}
		@Column(name="eproject")
		public String getEproject() {
			return eproject;
		}
		public void setEproject(String eproject) {
			this.eproject = eproject;
		}
		
}
