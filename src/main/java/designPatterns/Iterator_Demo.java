package designPatterns;

/**
 * Created by Ramesh on 030 30.May.21.
 */
interface IteratorIntf {
    boolean hasNext();
    Object next();
}

interface RepositoryIntf {
    IteratorIntf getIterator();
}

class RepositoryImpl implements RepositoryIntf {
    Object[] objArray;
    RepositoryImpl(Object... objArray) {
        this.objArray = objArray;
    }
    @Override
    public IteratorIntf getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements IteratorIntf {
        int index;
        @Override
        public boolean hasNext() {
            if(index < objArray.length) {
                return true;
            } else {
                return false;
            }
        }
        public Object next() {
            if(this.hasNext()) {
                return objArray[index++];
            }
            return null;
        }
    }
}

public class Iterator_Demo {
    public static void main(String[] args) {
        RepositoryImpl impl = new RepositoryImpl("Hello", "Ramesh" ,"Welcome");
        IteratorIntf intf = impl.getIterator();
        while(intf.hasNext()) {
            //String name  = (String)intf.next();
            System.out.println(intf.next());
        }
    }
}
