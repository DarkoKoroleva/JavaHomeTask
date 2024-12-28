package haffmanAlg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class Encoder {
    private final Map<Byte, String> huffmanCodes;

    public Encoder(HuffmanTree huffmanTree) {
        this.huffmanCodes = huffmanTree.getHuffmanCodes();
    }

    public void encode(byte[] data, String filePath) {
        StringBuilder encodedText = new StringBuilder();
        for (byte b : data) {
            String code = huffmanCodes.get(b);
            if (code != null) {
                encodedText.append(code);
            } else {
                throw new IllegalArgumentException("Byte not found in Huffman codes: " + b);
            }
        }

        int fullBytes = encodedText.length() / 8;
        int remainingBits = encodedText.length() % 8;

        byte[] resultBytes = new byte[fullBytes + (remainingBits > 0 ? 1 : 0)];

        for (int i = 0; i < resultBytes.length; i++) {
            String byteString = encodedText.substring(i * 8, Math.min (i * 8 + 8, encodedText.length()));
            resultBytes[i] = (byte) Integer.parseInt(byteString, 2);
        }

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(remainingBits);
            fos.write(resultBytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
