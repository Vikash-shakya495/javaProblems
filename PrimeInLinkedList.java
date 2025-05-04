import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;


    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void printPrimes() {
        Node temp = head;
        System.out.print("Prime numbers in the linked list: ");
        boolean found = false;
        while (temp != null) {
            if (isPrime(temp.data)) {
                System.out.print(temp.data + " ");
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class PrimeInLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.insert(scanner.nextInt());
        }

        System.out.println("Original List:");
        list.display();

        list.printPrimes();
        
        scanner.close();
    }
}