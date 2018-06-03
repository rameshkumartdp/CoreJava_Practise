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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="delegate")
public class Delegate {
		private int did;
		private String dname;
		private List<Event> event= new ArrayList<Event>();
		@Id
		@Column(name="did")
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ram")
		@SequenceGenerator(name="ram",sequenceName="ram")
		public int getDid() {
			return did;
		}
		public void setDid(int did) {
			this.did = did;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		@ManyToMany
		@JoinTable(name="event_delegate",
							 joinColumns={@JoinColumn(name="did")},
							 inverseJoinColumns={@JoinColumn(name="eid")}
							)
		public List<Event> getEvent() {
			return event;
		}
		public void setEvent(List<Event> event) {
			this.event = event;
		}
		
}
