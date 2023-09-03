import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking{
    String Name;
    int busNo;
    Date date;
    Scanner scanner=new Scanner(System.in);
    Booking(){
        System.out.println("Enter your name :");
        Name=scanner.next();
        System.out.println("Enter your bus no :");
        busNo=scanner.nextInt();
        System.out.println("Enter date in the form of dd-mm-yyyy");
        String dateInput=scanner.next();
        SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy");
        try{
            date=dateformat.parse(dateInput);
        }catch (ParseException e){
         e.printStackTrace();
        }

    }

    public boolean isAvailable(ArrayList<Bus>buses,ArrayList<Booking>bookings){
      int  capacity=0;
      for(Bus bus:buses){
          if(bus.getBusNo()==busNo){
              capacity= bus.getCapacity();
          }
      }
      int booked=0;
      for (Booking b:bookings){
          if(b.busNo==busNo&&b.date.equals(date)){
              booked++;
          }


      }
     return booked<capacity?true:false;
    }

}