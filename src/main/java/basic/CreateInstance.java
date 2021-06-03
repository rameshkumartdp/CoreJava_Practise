package basic;

/**
 * Created by rk0000 on 6/12/18.
 */
public class CreateInstance {

    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) throws Exception{
        CreateInstance ci = new CreateInstance();
        Class cls = ci.getClass();
        Object obj= cls.newInstance();
        CreateInstance cin = (CreateInstance) obj;
        cin.print();

        Class class1 = Class.forName("CreateInstance");
        Object obj1 = class1.newInstance();
        CreateInstance cir = (CreateInstance)obj1;
        cir.print();
    }
}
