package itis.inf.main304;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        EmployeeElevator firstEmp = new EmployeeElevator(Status.Empty, TypeOfElevator.EmployeeElevator);

        EvenElevator firstEve = new EvenElevator(Status.Full, TypeOfElevator.EvenElevator);
        EvenElevator secondEve = new EvenElevator(Status.Empty, TypeOfElevator.EvenElevator);
        EvenElevator thirdEve = new EvenElevator(Status.Full, TypeOfElevator.EvenElevator);

        OddEleveator firstOdd = new OddEleveator(Status.Full, TypeOfElevator.OddElevator);
        OddEleveator secondOdd = new OddEleveator(Status.Empty, TypeOfElevator.OddElevator);
        OddEleveator thirdOdd = new OddEleveator(Status.Full, TypeOfElevator.OddElevator);

        list.addToEnd(firstEve);
        list.addToEnd(secondEve);
        list.addToEnd(thirdEve);
        list.addToEnd(firstOdd);
        list.addToEnd(secondOdd);
        list.addToEnd(thirdOdd);
        list.addToEnd(firstEmp);

        list.printList();


        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.OddElevator);
        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.OddElevator);
        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.OddElevator);
        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.OddElevator);
        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.OddElevator);
        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.OddElevator);
        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.OddElevator);
        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.OddElevator);
        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.OddElevator);
        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.OddElevator);
        list.callElevator(TypeOfElevator.EvenElevator);
        list.callElevator(TypeOfElevator.EmployeeElevator);





    }
}
