public class Main {
    public static void main(String[] args) throws InterruptedException {
        Table table=new Table();
         Thread t1=new Thread(){
             public void run(){
                 try {
                     table.printTable(5);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         };
        Thread t2=new Thread(){
            public void run(){
                try {
                    table.printTable(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t1.start();
        t2.start();



    }
}