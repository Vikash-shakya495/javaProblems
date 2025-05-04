class LL {
    Node head;
    private int size;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            System.out.println("This LinkedList is Empty to insert in first");
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("This LinkedList is Empty to insert in last");
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("This LinkedList is Empty to print");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " - > ");
            currNode = currNode.next;

        }
        System.out.println("null");
    }

    //delete first 
    public void deleteFirst(){
        if(head == null){
            System.out.println("This LL is Empty to delete from First");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("This LL is Empty to delete from First");
            return;
        }

        size--;
        if(head.next == null){
            head =null;
            return;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next =null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("Vikash");
        System.out.println(list.getSize());
        

    }
}
