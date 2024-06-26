public class Main {
    public static void main(String[] args) {

        Heap heap = new Heap(10);


        //O(log n)
        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        System.out.println("Peeking" + heap.peek());

        heap.pritnHeap();
        heap.sort();

        //O(n)
       // heap.delete(1);
       // heap.delete(5);
        //heap.delete(0);
        heap.pritnHeap();


    }
}