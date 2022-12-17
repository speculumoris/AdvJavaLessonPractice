package multithreads.creation;

public class ThreadCreation2 {
    //Task4: anonymous class kullanarak thread oluşturunuz.
//       lambda expression kullanarak thread oluşturunuz.
    public static void main(String[] args) {

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("isimsiz thread");
            }
        });
        Thread thread2=new Thread(()->{
            System.out.println("LAmbda ile");
        });
        thread1.start();
        thread2.start();


    }
}
