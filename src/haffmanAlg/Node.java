package haffmanAlg;

public class Node implements Comparable<Node> {
    byte character;
    long frequency;
    Node left, right;

    public Node(byte character, long frequency) {
        this.character = character;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }

    public Node(byte character, long frequency, Node left, Node right) {
        this.character = character;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(Node other) {
        return Long.compare(this.frequency, other.frequency);
    }
}
