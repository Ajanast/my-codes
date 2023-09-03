

public class Table extends Thread{
    synchronized void printTable(int n) throws InterruptedException {
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            Thread.sleep(200);
        }
    }


}
