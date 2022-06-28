package freiwilligeUebungen.Uebung3;

public class LinearList {
    public ListElement first;

    public void addFirst(int value) {
        // f�gt am Kopf der Liste ein neues Element ein
        ListElement element = new ListElement();

        element.content = value;
        element.next = first;
        first = element;
    }

    public void removeFirst() {
        if (first != null)
            first = first.next;
    }

    public int getFirst() {
        if (first != null)
            return first.content;

        return 0;
    }

    public int getLast() {
        int result = 0;
        ListElement n = first;

        while (n != null) {
            result = n.content;
            n = n.next;
        }
        return result;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public int size() {
        int counter = 0;
        ListElement n = first;

        while (n != null) {
            counter++;
            n = n.next;
        }
        return (counter);
    }

    public void output() {
        ListElement n = first;
        System.out.print("\n( ");
        while (n != null) {
            System.out.print(n.content + " ");
            n = n.next;
        }
        System.out.println(")");
    }

    public ListElement deepClone() {
        LinearList linearList = new LinearList();
        return new ListElement();
    }

}