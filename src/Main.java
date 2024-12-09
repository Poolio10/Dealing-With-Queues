import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.add("George");
        queue1.add("Jim");
        queue1.add("John");
        queue1.add("Blake");
        queue1.add("Kevin");
        queue1.add("Michael");
        queue1.add("Walter");
        queue1.add("Angel");

        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("George");
        queue2.add("Katie");
        queue2.add("Kevin");
        queue2.add("Michelle");
        queue2.add("Ryan");
        queue2.add("Angel");

        System.out.println("Priority Queue 1: " + queue1);
        System.out.println("Priority Queue 2: " + queue2);
        System.out.println();

        union(queue1, queue2);
        difference(queue1, queue2);
        intersection(queue1, queue2);
    }

    //Union method
    public static void union(PriorityQueue<String> queue1, PriorityQueue<String> queue2){
        PriorityQueue<String> union = new PriorityQueue<>(queue1);
        PriorityQueue<String> test = new PriorityQueue<>(queue2);
        for (String s : union) {
            if(union.contains(test.peek())) test.poll();
        }
        union.addAll(test);

        System.out.println("Union of Priority Queues: " + union);
    }

    //Difference method
    public static void difference(PriorityQueue<String> queue1, PriorityQueue<String> queue2){
        PriorityQueue<String> difference = new PriorityQueue<>(queue1);

        difference.removeAll(queue2);

        System.out.println("Difference of Priority Queues: " + difference);
    }

    //Intersection method
    public static void intersection(PriorityQueue<String> queue1, PriorityQueue<String> queue2){
        Queue<String> intersection = new LinkedList<>(queue1);

        intersection.retainAll(queue2);

        System.out.println("Intersection of Priority Queues: " + intersection);
    }
}