interface Order {
public void greater(int p1, int p2);
}
public class Question2 {
public static void main(String[] args) {
Order s = (p1,p2) -> {
if (p1> p2)
System.out.println(p1 + "Order is Accepted");
else if (p2 > p1)
System.out.println(p2 + " Order is Completed");
};
s.greater( 10000,15000);
}
}