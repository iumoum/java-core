package javacore;

import java.io.*;
import java.util.Properties;

public class MakePropertiesDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       /* Properties p = new Properties();
        OutputStream os = new FileOutputStream("dbConnectionInfo.properties");

        p.setProperty("url", "localhost:3306/myDb");
        p.setProperty("uName", "root");
        p.setProperty("pass", "kjw1123!");

        p.store(os, null);*/

       Properties p = new Properties();

       InputStream is = new FileInputStream("dbConnectionInfo.properties");
       p.load(is);

       System.out.println(p.getProperty("uName"));

       p.list(System.out);      // 모든 properties를 콘솔창에(System.out) 나열함
    }
}
