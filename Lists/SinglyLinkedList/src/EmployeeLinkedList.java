public class EmployeeLinkedList {

    //head of the node
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {

        EmployeeNode node = new EmployeeNode(employee);
        System.out.println( "Head" +head);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront() {

        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;
        head = removedNode.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printAllEmployee() {
        EmployeeNode current = head;
        System.out.print("HEAD ->");

        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("Null");
    }
}
