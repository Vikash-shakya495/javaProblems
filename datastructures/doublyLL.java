public class doublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            this.data = val;
        }
    }

    // Display from head
    public static void display(Node head) {
        System.out.print("null -> ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display in reverse from tail
    public static void displayRev(Node tail) {
        System.out.print("null -> ");
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Add node at beginning
    public static Node addFirst(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    // Add node at end
    public static void addLast(Node head, int x) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(x);
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Add node at specific index (after idx-th node)
    public static void addRandom(Node head, int idx, int x) {
        Node s = head;
        for (int i = 0; i < idx; i++) {
            if (s == null) return;
            s = s.next;
        }
        if (s == null) return;

        Node r = s.next;
        Node newNode = new Node(x);
        s.next = newNode;
        newNode.prev = s;
        newNode.next = r;
        if (r != null) r.prev = newNode;
    }

    // Delete first node
    public static Node deleteFirst(Node head) {
        if (head == null || head.next == null) return null;

        head = head.next;
        head.prev = null;
        return head;
    }

    // Delete last node
    public static void deleteLast(Node head) {
        if (head == null || head.next == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    // Delete at specific index
    public static void deleteRandom(Node head, int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            if (temp == null) return;
            temp = temp.next;
        }

        if (temp == null || temp.prev == null || temp.next == null) return;

        Node before = temp.prev;
        Node after = temp.next;

        before.next = after;
        after.prev = before;
    }

    public static void main(String[] args) {
        // Initial list: 3 -> 4 -> 5 -> 6 -> 7
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);

        a.next = b; b.prev = a;
        b.next = c; c.prev = b;
        c.next = d; d.prev = c;
        d.next = e; e.prev = d;

        Node head = a;

        System.out.println("Original list:");
        display(head);

        head = addFirst(head, 1);
        System.out.println("\nAfter addFirst(1):");
        display(head);

        addLast(head, 9);
        System.out.println("\nAfter addLast(9):");
        display(head);

        addRandom(head, 2, 99); // after 2nd node
        System.out.println("\nAfter addRandom(index=2, value=99):");
        display(head);

        head = deleteFirst(head);
        System.out.println("\nAfter deleteFirst():");
        display(head);

        deleteLast(head);
        System.out.println("\nAfter deleteLast():");
        display(head);

        deleteRandom(head, 3); // delete node at index 3
        System.out.println("\nAfter deleteRandom(index=3):");
        display(head);
    }
}
