package multithreads.creation;

public class Counter implements Runnable{
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+" basladi");
        for (int i = 1; i <101 ; i++) {
            System.out.println(this.name+"--"+i);

        }
        System.out.println(this.name+" basladi");
    }
    //Task2:Runnable interfaceni implement eden Counter isminde sınıf oluşturup
    // bu sınıftan harfleri a dan z ye kadar yazdıran iki tane thread oluşturunuz.
    public static void main(String[] args) {
        Counter c1=new Counter("RoadRunner");
        Counter c2=new Counter("SpeedyGonzales");
        System.out.println("yaris basladi");
        Thread thr1=new Thread(c1);
        Thread thr2=new Thread(c2);
        thr1.start();
        thr2.start();

        try {
            thr1.join();
            thr2.join();
            System.out.println("Yarış bitti");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
