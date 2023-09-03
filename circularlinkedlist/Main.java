public class Main {
    public static void main(String[] args) {
        circularLink<String>names=new circularLink<>();
        names.insertAtBegin("anast");
        names.insertAtEnd("jana");
        names.display();
    }
}