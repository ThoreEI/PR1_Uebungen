package klaus_se21_sommer;

public class Aufgabe4 {
    public static void main(String[] args) {
        LinearList linearList = new LinearList();
        linearList.addFirst(1);
        linearList.addFirst(2);
        linearList.addFirst(3);
        linearList.addFirst(4);
        linearList.addFirst(5);
        linearList.addFirst(6);
        System.out.println(linearList);
        linearList.removeBeforeLast();
        System.out.println(linearList);


    }
}
class ListElement {
    int content;
    ListElement next;
}

class LinearList {
    public ListElement first;

    public void removeBeforeLast() {
        if (first.next.next == null)
            first = first.next;
        ListElement tmp = first.next;
        while (tmp.next.next.next != null)
            tmp = tmp.next;
        tmp.next = tmp.next.next;
    }

    public void addFirst(int value) {
        ListElement n = new ListElement();
        n.content = value;
        n.next = first;
        first = n;
    }

    @Override
    public String toString() {
        ListElement e = first;
        int count = 1;
        while(e != null) {
            System.out.println(count + ":  " + e.content + " ");
            e = e.next;
            count++;
    }
        return "******";
    }

}