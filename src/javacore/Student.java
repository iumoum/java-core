package javacore;

public class Student {
    private int rollNo;
    private String sName;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString(){
        return "Student{" +
                    "rollNo=" + this.rollNo +
                    ", sName=" + this.sName +
                "}";
    }
}
