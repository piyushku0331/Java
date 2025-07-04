package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //class
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    int value() default 0;
    String name() default "Chitkara";
}

@MyAnno(value = 9000)
class Demo{}

public class UserDefinedAnnotation {
    public static void main(String[] args) {
        Demo obj = new Demo();
        Class<? extends Demo> c = obj.getClass();
        System.out.println(c.getName());
        MyAnno anno = c.getAnnotation(MyAnno.class);
        System.out.println(anno.value());
        System.out.println(anno.name());
    }
}
