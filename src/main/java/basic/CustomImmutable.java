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
        this.myBean = myBean;
    }

    public static void main(String[] args) {
        MyBean myBean = new MyBean("Ramesh", 13228, 29);
        CustomImmutable immutable = new CustomImmutable("Hello", 123, myBean);
        myBean.setName("Tom");
        System.out.println(myBean.getName());
    }
}

class MyBean {
    private String name;
    private int id;
    private int age;

    public MyBean(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
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
}
