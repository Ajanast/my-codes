public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable  db=() ->
          {
                for(int i=0;i<5;i++){
                    System.out.println("Updated DB");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

        };
        num n=new num();
        Thread thread=new Thread(db);
       //thread.setPriority(10);

         thread.start();
        n.start();
        if(thread.isAlive()){
            System.out.println("Still executing");
        }
        thread.join();
        n.join();
        if(thread.isAlive()){
            System.out.println("Still executing");
        }
        else
            System.out.println("Thread is ended");

        System.out.println("Finish");
    }
}