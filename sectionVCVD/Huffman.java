import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {
    char data;
    int freq;
    Node left, right;

    Node(char data, int freq) {
        this.data = data;
        this.freq = freq;
        left = null;
        right = null;
    }

    // compareTo method to compare nodes based on frequency
    public int compareTo(Node node) {
        return this.freq - node.freq;
    }
}


public class Huffman {
    // recursive method to traverse Huffman coding tree and assign codes to each character
    public static void assignCode(Node node, String code, Map<Character, String> codes) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            codes.put(node.data, code);
            return;
        }

        assignCode(node.left, code + "0", codes);
        assignCode(node.right, code + "1", codes);
    }



    public static void main(String[] args) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node('A', 4));
        pq.add(new Node('B', 2));
        pq.add(new Node('C', 1));
        pq.add(new Node('D', 10));
        pq.add(new Node('E', 5));

        while (pq.size() > 1) {
            // extract the two nodes with smallest frequency
            Node node1 = pq.poll();
            Node node2 = pq.poll();

            // create new parent node with combined frequency
            Node parent = new Node('$', node1.freq + node2.freq);
            parent.left = node1;
            parent.right = node2;

            // add parent node back to priority queue
            pq.add(parent);
        }

        // the last node in the priority queue is the root of the Huffman coding tree
        Node root = pq.peek();
        // create a map to store the codes for each character
        Map<Character, String> codes = new HashMap<>();

        assignCode(root, "",codes);

        // print the codes for each character
        for(Map.Entry<Character, String> entry :codes.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
