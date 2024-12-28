package haffmanAlg;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Use <encode/decode> <input file> <codes file> <output file>");
            return;
        }

        String command = args[0];
        String inputFilePath = args[1];
        String codes = args[2];
        String outputFilePath = args[3];

        try {
            if (command.equals("encode")) {
                byte[] content = FileManager.readFileToByteArray(inputFilePath);
                HuffmanTree codeTree = new HuffmanTree();
                codeTree.buildTree(inputFilePath);
                Encoder encoder = new Encoder(codeTree);
                encoder.encode(content, outputFilePath);

                FileManager.writeCode(codes, codeTree.getHuffmanCodes());
                System.out.println("File encoded successfully");

            } else if (command.equals("decode")) {
                String decodedText = Decoder.decode(codes, inputFilePath);
                FileManager.writeFile(outputFilePath, decodedText);
                System.out.println("File decoded successfully");

            } else {
                System.out.println("Unknown command: " + command);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}