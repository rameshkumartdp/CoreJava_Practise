package basic;

/**
 * Created by rk0000 on 7/15/18.
 */
public final class CustomImmutable {
    private String member1;
    private int member2;
    private MyBean myBean;

    public CustomImmutable(String member1, int member2, MyBean myBean) {
        this.member1 = member1;
        this.member2 = member2;

        MyBean beanObj = new MyBean("CustomImmutable()");
        beanObj.setName(myBean.getName());
        beanObj.setId(myBean.getId());
        beanObj.setAge(myBean.getAge());
        this.myBean = beanObj;

//        this.myBean = myBean;
    }

    public String getMember1() {
        return member1;
    }

    public int getMember2() {
        return member2;
    }

    public MyBean getMyBean() {
        MyBean beanObj = new MyBean("getMyBean()");
        beanObj.setName(this.myBean.getName());
        beanObj.setId(this.myBean.getId());
        beanObj.setAge(this.myBean.getAge());
        return beanObj;
    }

    @Override
    public String toString() {
        return "CustomImmutable{" +
                "member1='" + member1 + '\'' +
                ", member2=" + member2 +
                ", myBean=" + myBean +
                '}';
    }

    public static void main(String[] args) {
        MyBean myBean = new MyBean("main");
        myBean.setName("Ramesh");
        myBean.setId(132228);
        myBean.setAge(29);

        CustomImmutable immutable = new CustomImmutable("Hello", 123, myBean);
        System.out.println("immutable hashCode --> " + immutable.hashCode());
        myBean.setName("Tom");
        System.out.println(immutable);

        immutable.getMyBean().setName("Jerry");

        System.out.println(immutable);

        CustomImmutable immutable1 = new CustomImmutable("Hello", 123, myBean);
        System.out.println("immutable1 hashCode --> " + immutable1.hashCode());

        System.out.println("EQUALS --->  "+ immutable.equals(immutable1));
    }
}

class MyBean {
    private String name;
    private int id;
    private int age;

    MyBean(String loc) {
        System.out.println("MyBean Constructor from ---> " + loc);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
