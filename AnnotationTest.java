import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;@Retention(RUNTIME)
@Target(METHOD)
@interface Test{}
public class AnnotationTest{
public void display() {
System.out.println("Pravallika");
}
public static void main(String[] args) {
AnnotationTest obj = new AnnotationTest();
obj.display();
}}