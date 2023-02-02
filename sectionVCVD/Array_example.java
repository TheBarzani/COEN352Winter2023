import java.util.*;

public class Array_example {

    /**
     *
     *
     * Arrays help maintain large sets of data
     * under a single variable name to avoid confusion
     * that can occur when using several variables
     * @param args
     */

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
//
//        // String array
//        String array[] = new String[5];
//        for(int i=0;i<array.length;i++){
//            System.out.println("enter input : ");
//            array[i] = sc.nextLine();
//        }
//
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]+" ");
//
//        }
//
//
//        //Double array
//        // declare an array
//        double data[][] = new double[10][10];
//
//        //int array
//        //declare and initialize and array
        Integer[] age = {12, 4, 5, 2, 5};
//
//        // access each array elements
//        System.out.println("Accessing Elements of Array:");
//        System.out.println("First Element: " + age[0]);
//        System.out.println("Second Element: " + age[1]);
//        System.out.println("Third Element: " + age[2]);
//        System.out.println("Fourth Element: " + age[3]);
//        System.out.println("Fifth Element: " + age[4]);

        //array
        // https://www.javatpoint.com/array-in-java

        //stack"StCK
        System.out.println("STACK");
        Stack<Integer> temp = new Stack<Integer>();
        temp.push(5);
        temp.push(4);
        System.out.println("temp.pop() :" + temp.pop());
        System.out.println("temp.peek() :" + temp.peek());

        //stack
        //https://www.programiz.com/java-programming/stack

        //convert array to list
        List<Integer> list = Arrays.asList(age);
        System.out.println(list);

        //queue
       // https://www.programiz.com/java-programming/queue

        Queue<Integer> queue=new PriorityQueue<Integer>();
        queue.add(5);
        queue.add(6);


        System.out.println(queue.peek());
    }
}
