package haffmanAlg;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Decoder {

    public static String decode(String codes, String encodeFile) {
        Map<String, Byte> encoding;
        try {
            encoding = FileManager.readCode(codes);
        } catch (NumberFormatException e) {
            return "invalid file";
        }

        StringBuilder decodedText = new StringBuilder();
        try (FileInputStream reader = new FileInputStream(encodeFile)) {
            int validBits = reader.read();
            StringBuilder binaryStringBuilder = new StringBuilder();
            int currentByte;
            while ((currentByte = reader.read()) != -1) {
                String binaryString = Integer.toBinaryString(currentByte & 0xFF);

                while (binaryString.length() < 8) {
                    binaryString = "0" + binaryString;
                }
                binaryStringBuilder.append(binaryString);
            }

            // Remove invalid bits from the last byte
            if (validBits > 0 && binaryStringBuilder.length() > 8) {
                int totalBits = binaryStringBuilder.length();
                binaryStringBuilder.delete(totalBits - 8, totalBits - validBits);
            }

            String binaryString = binaryStringBuilder.toString();
            int start = 0;

            while (start < binaryString.length()) {
                boolean matchFound = false;
                for (int end = start + 1; end <= binaryString.length(); end++) {
                    String code = binaryString.substring(start, end);
                    if (encoding.containsKey(code)) {
                        decodedText.append((char) encoding.get(code).byteValue());
                        start = end;
                        matchFound = true;
                        break;
                    }
                }
                if (!matchFound) {
                    throw new IllegalArgumentException("Invalid encoding in file at position: " + start);
                }
            }

        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return decodedText.toString();
    }
}
