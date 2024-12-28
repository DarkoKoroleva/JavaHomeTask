package haffmanAlg;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class FileManager {

    public static byte[] readFileToByteArray(String file) throws IOException {
        File newFile = new File(file);
        int i = 0;
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] fileData = new byte[(int) newFile.length()];
            int bytesRead = fis.read(fileData);
            if (bytesRead != fileData.length) {
                throw new IOException("Failed to read the entire file");
            }
            return fileData;
        }
    }

    public static Map<String, Byte> readCode(String filePath){
        Map<String, Byte> map = new HashMap<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {

            while (dis.available() > 0) {
                byte b = dis.readByte();
                int codeLength = dis.readByte();
                int codeAsInt = dis.readInt();
                String code = Integer.toBinaryString(codeAsInt);
                code = String.format("%" + codeLength + "s", code).replace(' ', '0');
                map.put(code, b);
                        //String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
                //ОБРАТНЫЙ ПОРЯДОК: КОД - СИМВОЛ
            }
        } catch (IOException e) {
            System.out.println("Error reading dictionary from file: " + filePath);
            System.out.println(e.getMessage());
            return null;
        }
        return map;
    }

//    public static Map<String, String> readCode(String filePath) throws NumberFormatException {
//        Map<String, String> encoding = new HashMap<>();
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
//            String s;
//            char c;
//            while ((s = reader.readLine()) != null) {
//                StringBuilder str = new StringBuilder(s);
//                if (s.contains("caret") || s.contains("enter")) {
//                    String[] arg = s.split(" = ", 2);
//                    if (arg[0].equals("caret")){
//                        encoding.put(arg[1], '\r');
//                    } else if (arg[0].equals("enter")){
//                        encoding.put(arg[1], '\n');
//                    }
//                } else {
//                    c = s.charAt(0);
//                    String code = str.delete(0, 2).toString();
//                    encoding.put(code, c);
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }
//        return encoding;
//    }

    public static void writeFile(String filePath, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(content);
        writer.flush();
    }

    public static void writeCode(String filePath, Map<Byte, String> dictionary) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {

            for (Map.Entry<Byte, String> entry : dictionary.entrySet()) {
                byte b = entry.getKey();
                String code = entry.getValue();

                dos.writeByte(b);

                dos.writeByte(code.length());

                dos.writeInt(Integer.parseInt(code, 2));
            }
        } catch (Exception e) {
            System.out.println("Error writing dictionary to file: " + filePath);
            System.out.println(e.getMessage());
        }
    }
}
