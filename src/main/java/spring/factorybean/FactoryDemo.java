package spring.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.util.Calendar;

/**
 * Created by rk0000 on 6/28/18.
 */
public class FactoryDemo implements FactoryBean {

    @Override
    public Object getObject() {
        return Calendar.getInstance();
    }

    @Override
    public Class getObjectType() {
        return Calendar.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
