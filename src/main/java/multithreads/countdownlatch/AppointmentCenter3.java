package multithreads.countdownlatch;
/*
Geri sayım tamamlanıncaya kadar CountDownLatch örneğinin "await()" metodunu çağıran tüm threadler bekletilir.
Geri sayım tamamlandığında bir anlamda kapı sürgüsü açılır ve bekleyen threadler işlemeye devam eder.
Örneğin "n" sayıda threadin işlerini bitirdiklerini bildirene kadar (yani her biri sayacı bir azaltana ve
nihayetinde sayacın değeri sıfıra ulaşana kadar) ana threadin bekletilmesi istediğimiz bir
durumda kullanılabilir.

Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
      Uygulama herbir talep için bir gün sonrasına tarih
      vermelidir. Randevu tarihini veren threadlerden önce
      randevu öncesinde bazı işlemleri gerçekleştiren threadlerin
      çalışmasını sağlayınız.
 */

public class AppointmentCenter3 {

}
