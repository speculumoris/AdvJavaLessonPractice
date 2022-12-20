package multithreads.synchronization;

public class AppointmentApp {
    //Multithreading programlamada birden fazla Thread aynı anda ortak bir kaynağa erişmeye çalışırsa
    //istenmeyen sonuçlar oluşacaktır. Bu durumda threadlere sırayla erişim vermek gerekecektir.
    // Bir thread kaynağı kullanıyorken diğerleri onu beklemelidirler. Bu "synchronized" keywordü ile sağlanır.
    // Bir thread kaynağı kullanıyorken diğerleri onu beklemelidirler. Bu "synchronized" keywordü ile sağlanır.
    //synchronized keywordü metot ve bloklarda kullanılır.

    /*
    Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
          Uygulama herbir talep için bir gün sonrasına tarih
          vermelidir.
    */
    public static void main(String[] args) {

        String[] users = {"Tolstoy", "Victor Hugo", "Balzac", "Dostoyevski", "JohnSteinbeck"};

        AppointmentCenter appCenter = new AppointmentCenter();
        for (String user : users) {


            Thread thread = new Thread(new Runnable() {

                @Override
                public void run() {
                    Thread.currentThread().setName(user);
                    String name = Thread.currentThread().getName();
                    System.out.format("Sayın %-16s,Randevu tarihiniz: %10s,%n", name, appCenter.getAppointmentDate());
                }
            });
            thread.start();

        }
    }
}
