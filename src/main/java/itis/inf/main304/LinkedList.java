package itis.inf.main304;

public class LinkedList implements ElevatorFree, CallElevator{
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToEnd(Elevator elevator) {
        Node newNode = new Node(elevator);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.setNext(head);
        } else {
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
        } else {
            Node current = head;

            do {
                System.out.print(current.getStatus() + " ");
                current = current.getNext();
            } while (current != head);

            System.out.println();
        }
    }

    @Override
    public Node elevatorFree() {
        Node current = head;

        boolean flag = true;
        while (flag) {
            if (current.getStatus().equals(Status.Full)){
                current = current.next;
            }
            flag = false;
        }
        return current;
    }

    @Override
    public void callElevator() {
        Node current = elevatorFree();
        System.out.println(current.getTypeOfElevator() + " " + current.getStatus() + "Приехал");

    }
}
