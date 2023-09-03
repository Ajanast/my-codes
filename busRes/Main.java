import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bus>buses=new ArrayList<Bus>();
        ArrayList<Booking>bookings=new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,10));
        buses.add(new Bus(3,true,20));

        for(Bus bus:buses){
            bus.Display();
        }

        int choice =1;
        Scanner scanner =new Scanner(System.in);
        while(choice==1){
            System.out.println("Enter booking to 1 reject 2");
            choice=scanner.nextInt();
            if(choice==1){
                Booking booking=new Booking();
                if(booking.isAvailable(buses,bookings)){
                    bookings.add(booking);
                    System.out.println("Your booking is conform");
                }
                else
                    System.out.println("The Bus is full try another bus or date ");
            }
            else{
                System.out.println("Thanks for coming :");
            }
        }



    }
}