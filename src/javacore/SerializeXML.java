package javacore;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeXML {
    public static void main(String[] args) throws Exception{
        Student s1 = new Student();
        s1.setRollNo(1);
        s1.setSName("Jiwan Kim");

        Student s2 = new Student();
        s2.setRollNo(2);
        s2.setSName("Jangsung Kim");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);

        College c1 = new College();
        c1.setStudents(studentList);

        XMLEncoder xe = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
        xe.writeObject(c1);
        xe.close();

        XMLDecoder xd = new XMLDecoder(new BufferedInputStream(new FileInputStream("myCollege.xml")));
        College c2 = (College) xd.readObject();
        xd.close();

        List<Student> studentList2 = c2.getStudents();

        for(Student student : studentList2){
            System.out.println(student);
        }
    }
}
