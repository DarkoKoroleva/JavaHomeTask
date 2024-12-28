package haffmanAlg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanTree {
    private Node root;
    private Map<Byte, String> huffmanCodes = new HashMap<>();

    public void buildTree(String fileName) throws IOException {
        Map<Byte, Integer> frequencyMap = calculateFrequency(fileName);

        PriorityQueue<Node> queue = new PriorityQueue<>();
        for (Map.Entry<Byte, Integer> entry : frequencyMap.entrySet()) {
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();
            long sum = left.frequency + right.frequency;
            queue.add(new Node((byte) 0, sum, left, right));
        }

        root = queue.poll();
        buildCodes(root, "");
    }

    private Map<Byte, Integer> calculateFrequency(String fileName) throws IOException {
        Map<Byte, Integer> frequencyMap = new HashMap<>();
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            int b;
            while ((b = inputStream.read()) != -1) {
                byte byteValue = (byte) b;
                frequencyMap.put(byteValue, frequencyMap.getOrDefault(byteValue, 0) + 1);
            }
        }
        return frequencyMap;
    }

    private void buildCodes(Node node, String code) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            if (code.isEmpty()) {
                code = "0";
            }
            huffmanCodes.put(node.character, code);
        }

        buildCodes(node.left, code + '0');
        buildCodes(node.right, code + '1');
    }

    public String serialize() {
        StringBuilder builder = new StringBuilder();
        for (byte c : huffmanCodes.keySet().toArray(new Byte[0])) {
            builder.append(c).append(':').append(huffmanCodes.get(c)).append('\n');
        }
        return builder.toString();
    }

    public Map<Byte, String> getHuffmanCodes() {
        return huffmanCodes;
    }

    public Node getRoot() {
        return root;
    }
}
