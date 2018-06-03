package hibernate.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
		private int sid;
		private String sname;
		private String sroll;
		private College coll;
		@Id
		@Column(name="sid")
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ram")
		@SequenceGenerator(name="ram",sequenceName="ram")
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		@Column(name="sname")
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		@Column(name="sroll")
		public String getSroll() {
			return sroll;
		}
		public void setSroll(String sroll) {
			this.sroll = sroll;
		}
		@ManyToOne
		@JoinColumn(name="student_id")
		public College getColl() {
			return coll;
		}
		public void setColl(College coll) {
			this.coll = coll;
		}
		
}
