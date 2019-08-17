package javacore;

import java.io.*;

public class SerialDemo {
    public static void main(String[] args) throws Exception {
        Save obj = new Save();

        obj.i = 1;
        obj.name = "Jiwan Kim";
        obj.age = 27;
        obj.test = new HandlingFileDemo();

        File f = new File("obj.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(obj);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Save newObj = (Save) ois.readObject();

        System.out.println(newObj.toString());
        newObj.intro();
    }
}

class Save implements Serializable {        // Marker Interface를 이용해 serial을 허용
    int i;
    String name;
    int age;
    HandlingFileDemo test;

    public void intro(){
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Save{" +
                "i=" + i +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", test=" + test +
                '}';
    }
}
