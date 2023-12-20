package itis.inf.main304;

public class Node {
    protected Elevator elevator;
    protected Status status;
    protected Node next;

    public Node(Elevator elevator) {
        this.elevator = elevator;
        this.next = null;
    }

    public Status getStatus() {
        return this.elevator.status;
    }

    public TypeOfElevator getTypeOfElevator(){return this.elevator.typeOfElevator;}
    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

}
