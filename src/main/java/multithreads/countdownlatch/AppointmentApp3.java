package multithreads.countdownlatch;

import multithreads.synchronization.AppointmentCenter;
import multithreads.threadpool.AppointmentCenter2;

import java.util.concurrent.CountDownLatch;

public class AppointmentApp3 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(3);
        String users[]={"Tolstoy","C.Dickens","V.Hugo"};

        AppointmentCenter center =new AppointmentCenter();
        for (String user : users){
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Randevu tarihimiz: "+center.getAppointmentDate());
                }
            });
            thread.start();
        }
        Worker worker1 = new Worker("A",countDownLatch);
        Worker worker2 = new Worker("B",countDownLatch);
        Worker worker3 = new Worker("C",countDownLatch);

        worker1.start();
        worker2.start();
        worker3.start();
    }
}
