package hibernate.Composite;

import java.io.Serializable;

/**
 * Created by rk0000 on 6/26/18.
 */
public class CompKey implements Serializable{
    int empId, shortid;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getShortid() {
        return shortid;
    }

    public void setShortid(int shortid) {
        this.shortid = shortid;
    }
}
