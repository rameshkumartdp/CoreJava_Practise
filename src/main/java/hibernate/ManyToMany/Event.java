package hibernate.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="event")
public class Event {
		private int eid;
		private String ename;
		private List<Delegate> delegate = new ArrayList<Delegate>();
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
		@ManyToMany
		@JoinTable(name="event_delegate",
							 joinColumns={@JoinColumn(name="eid")},
							 inverseJoinColumns={@JoinColumn(name="did")}
							)
		public List<Delegate> getDelegate() {
			return delegate;
		}
		public void setDelegate(List<Delegate> delegate) {
			this.delegate = delegate;
		}
		
}
