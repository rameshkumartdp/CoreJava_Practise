package hibernate.basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_dtls")
public class Employee_Dtls {
		private int eid;
		private String edept;
		private String eproject;
		@Id
		@Column(name="eid")
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
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
