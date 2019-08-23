package javacore;

import java.lang.annotation.*;

@Documented                                 // java doc에 해당 애노테이션을 소개함
@Inherited                                  // 해당 애노테이션이 붙은 클래스를 상속 시 애노테이션도 자동으로 상속되게 함
@Target(ElementType.TYPE)                   // 클래스, 인터페이스(커스텀 애노테이션 포함), enum 선언 시
@Retention(RetentionPolicy.RUNTIME)         // 컴파일러에 의해 클래스파일에 해당 애노테이션 정의 내용이 저장되고 JVM에 의해 실행 중 유지됨. 따라서 reflection API로 읽기 가능
@interface SmartPhone{                      // Meta Annotation, MultiValue Annotation
    String os() default "Android";
    int version() default 8;
}

@SmartPhone(os="Mac", version = 5)
class SamsungGalaxy{
    String model;
    int price;

    public SamsungGalaxy(String model, int price){
        this.model = model;
        this.price = price;
    }

    public void show(){
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
    }
}

public class AnnotationDemo {

    public static void main(String[] args) {
        SamsungGalaxy samsungGalaxy = new SamsungGalaxy("Note 9", 300000);
        Class c;

        c = samsungGalaxy.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) an;

        System.out.println(s.os());
        System.out.println(s.version());

    }
}