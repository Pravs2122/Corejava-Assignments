public class PersistMain {
public static void main(String[] args) {
FilePersistance fp=new FilePersistance ();
fp.persist();
DataPersistance dp=new DataPersistance();
dp.persist();
}
}
abstract class Persistance{
abstract void persist();
}
class FilePersistance extends Persistance{
void persist() {
System.out.println("This is from File Persistance");
}
}
class DataPersistance extends Persistance{
void persist() {
System.out.println("This is from Data Persistance");
}
}