package javacore;

import java.io.*;

public class HandlingFileDemo implements Serializable{
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("demo.txt");
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("Hello, My name is Jiwan Kim");
        dos.flush();

        FileInputStream fis = new FileInputStream("demo.txt");
        DataInputStream dis = new DataInputStream(fis);

        System.out.println(dis.readUTF());
    }
}
