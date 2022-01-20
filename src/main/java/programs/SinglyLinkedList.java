package programs;

/**
 * Created by Ramesh on 001 01.Dec.21.
 */
class SinglyLinkedList {

    private Node start;

    public void add(Integer i) {
        Node node = new Node(i);
        if (start == null)
            start = node;
        else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public Node getStart() {
        return start;
    }

    public void traverse() {
        Node tmp = start;
        while(true) {
            if(tmp == null){
                break;
            }
            System.out.print(tmp.getValue() + "\t");
            tmp = tmp.getNext();
        }
        System.out.println();
    }

    public void reverse() {
        Node prev = null;
        Node current = start;
        Node next = null;
        while(current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        start = prev;
    }

    static class Node {
        Node(Integer i) {
            this.value = i;
        }

        private Integer value;
        private Node next;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

class FindLoopsInLinkedList {
    public static void main(String args[]) {

        FindLoopsInLinkedList finder = new FindLoopsInLinkedList();

        SinglyLinkedList sampleList = new SinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            sampleList.add(i);
        }

        sampleList.traverse();
        sampleList.reverse();
        sampleList.traverse();

        System.out.println("Loop Existence : " + finder.doesLoopExist(sampleList));
        System.out.println("Loop Existence : " + finder.doesLoopExist(finder.createLoop(sampleList)));
    }

    public boolean doesLoopExist(SinglyLinkedList listToCheck) {
        SinglyLinkedList.Node tortoise = listToCheck.getStart();
        SinglyLinkedList.Node hare = listToCheck.getStart();

        try {
            while (true) {
                tortoise = tortoise.getNext();
                hare = hare.getNext().getNext();
                if (tortoise == hare) {
                    return true;
                }
            }
        } catch (NullPointerException ne) {
            return false;
        }
    }

    private SinglyLinkedList createLoop(SinglyLinkedList sampleList) {
        sampleList.getStart().getNext().getNext().getNext().setNext(sampleList.getStart().getNext());
        return sampleList;
    }
}
