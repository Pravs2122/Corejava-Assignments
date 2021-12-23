import java.util.Set;
import java.util.TreeSet;
public class TreesetEmployee {
public static void main(String[] args) {
Set<Employee> names =new TreeSet<Employee>();
Employee E3 = new Employee(3,"Pavani","pavanimuppalla@gmail.com",60000);
Employee E4 = new Employee(4,"Parimala","parimalakasirajan@gmail.com",65000);
Employee E6 = new Employee(6,"Divya","divyachennoju@gmail.com",55000);
Employee E5 = new Employee(5,"Ravi","ravichanamala@gmail.com",45000);
Employee E2 = new Employee(2,"Divya","divyajarabana@gmail.com",80000);
Employee E1 = new Employee(1,"Pravallika","pravallikajarabana@gmail.com",90000);
Employee E10 = new Employee(10,"Sravani","sravanichenoji@gmail.com",30000);
Employee E9 = new Employee(9,"Mohitha","mohithadivvela@gmail.com",35000);
Employee E7 = new Employee(7,"karthik","karthikparsa@gmail.com",25000);
Employee E8 = new Employee(8,"Devi","devikannuru@gmail.com",15000);
names.add(E1);
names.add(E2);
names.add(E3);
names.add(E4);
names.add(E5);
names.add(E6);
names.add(E7);
names.add(E8);
names.add(E9);
names.add(E10);
for(Employee name:names) {
name.display();
}
}}
