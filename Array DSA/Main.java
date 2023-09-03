import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDemo<String> list = new ArrayDemo<String>();
              String val;
                int pos;
        while (true){
            System.out.println("\n---------------operation List--------------\n");
            System.out.println("1.insert at the end:\n");
            System.out.println("2.Display the array:\n");
            System.out.println("3.insert at specific position:\n");
            System.out.println("4.Delete at the specific position :\n");
            System.out.println("5.exit\n");
            System.out.println("---------------------------------------------------");
            System.out.println("Enter your choice");
            int choice =scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the data");

                    val=scanner.next();
                    list.add(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter position :");
                    pos=scanner.nextInt();
                    System.out.println("Enter data : ");
                    val=scanner.next();
                    list.insertArraypos(pos,val);
                    break;
                case 4:
                    System.out.println("Enter position :");
                    pos=scanner.nextInt();
                    list.delete(pos);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }

        }
    }
}