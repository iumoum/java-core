package javacore;

public class DemoCopy {

    public static void main(String[] args) throws CloneNotSupportedException {  // clone 메서드는 checked exception을 발생시키는 것 같다.
        CopyTarget ct = new CopyTarget();

        ct.setI(5);
        ct.setJ(7);

        System.out.println("target class attributes : " + ct.toString());

        CopyTarget shallowCopy = ct;

        System.out.println("shallow copy attributes : " + shallowCopy.toString());

        CopyTarget deepCopy = (CopyTarget) ct.clone();

        System.out.println("deep copy attributes" + deepCopy.toString());

        System.out.println("after change target attributes ===");

        ct.setI(3);
        ct.setJ(9);

        System.out.println("target class attributes : " + ct.toString());
        System.out.println("shallow copy attributes : " + shallowCopy.toString());
        System.out.println("deep copy attributes" + deepCopy.toString());
    }
}

class CopyTarget implements Cloneable {     // Cloneable Marker Interface를 통해 해당 클래스가 복사 가능함을 알려야 Exception이 발생하지 않는다.
    int i, j;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "CopyTarget{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {      // clone 메서드는 checked Exception을 발생시키는 것 같다.
        return super.clone();       // clone 메서드는 Object 클래스 내부에 protected 로 존재하기 때문에 clone 메서드를 다음과 같이 Override 한다.
    }

}
