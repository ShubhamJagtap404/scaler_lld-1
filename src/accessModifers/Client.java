package accessModifers;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "rahul";
        // st1.age = 20; ---> doesn;t work
        st1.batch = "apr25";

        st1.phone = "12312312";
    }
}
