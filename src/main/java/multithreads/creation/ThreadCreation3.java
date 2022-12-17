package multithreads.creation;

public class ThreadCreation3 {

    /*

1) Multithreading Programlama nedir?
    Aynı processde iki veya daha fazla iş parçacığının(thread) aynı anda çalışma süreci

2) Threadler 2 şekilde oluşturulur:

        --Thread sınıfından extend eden alt sınıf oluşturup, onun run metodu override edilir.

         --Runnable interfaceini implement eden bir alt sınıf oluşturup run metodu override edilir,
         ardından Thread sınıfının constructorına nesne olarak gönderilir.

3) Run metodunu doğrudan Main metodundan çağırabilir miyiz?

   Evet, ancak thread oluşturulmaz.

4) Javada herhangi bir thread oluşturmazsak uygulamalar nerde/nasıl çalışır?

   Java varsayılan olarak tüm uygulamalarda main threadini  kullanılır.


*/

    //Task1: Thread sınıfını extend eden Sayac isminde sınıf oluşturup
    // bu sınıftan sayıları 1 den 100 e kadar yazdıran iki tane thread oluşturunuz.,,
    public static void main(String[] args) {

        Sayac thread1 = new Sayac("YSB");
        Sayac thread2 = new Sayac("Krmanc");
        thread1.start();
        thread2.start();
    }
}

class Sayac extends Thread{
    private String name;

    public Sayac(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(this.name+" basladi");
        for (int i = 1; i <101 ; i++) {
            System.out.println(this.name+"--"+i);

        }
        System.out.println(this.name+" basladi");
    }

    public static void count(){

    }


}
