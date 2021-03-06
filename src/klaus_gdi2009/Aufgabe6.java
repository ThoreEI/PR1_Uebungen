package klaus_gdi2009;

public class Aufgabe6 {
    public static void main(String[] args) {
 /*
    Erweitern Sie die Klasse List um eine Methode void remove(int zahl), welche aus einer
    Liste alle Elemente mit dem Wert zahl entfernt.
  */
    }

    public class Element {
        int value;
        Element next;

        Element(int value, Element next) {
            this.value = value;
            this.next = next;
        }
    }
    public class List {
        Element head, last;
        void remove(int number) {
            while(head != null) {
                Element tmp = head;
                if (tmp.value == number) {
                    head = null;
                } else
                    insert(head.value);
            }
            if (last.value == number)
                last = null;
        }

        void append(int i) { // Anhängen am Ende
            Element ele = new Element(i, null);
            if (head == null)
                head = last = ele;
            else
                last = last.next = ele;
        }
        void insert(int i) { // Einfügen am Anfang
            head = new Element(i, head);
            if (last == null)
                last = head;
        }
    }
}
