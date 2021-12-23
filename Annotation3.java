import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;@Retention(RUNTIME)
@Target(METHOD)
@interface Execute{
int sequence();
}
class MyClass{
@Execute(sequence=3)
public void method1(String name)
{
System.out.println("Name :"+name);
} @Execute(sequence=1)
public void method2(String department)
{
System.out.println("Department :"+department);
} @Execute(sequence=2)
public void method3(int id)
{
System.out.println("Id :"+id);
} } public class Annotation3{
public static void main(String[] args) {
MyClass c = new MyClass();
c.method2("IT");
c.method1("Pravallika");
c.method3(46161);
}
}



