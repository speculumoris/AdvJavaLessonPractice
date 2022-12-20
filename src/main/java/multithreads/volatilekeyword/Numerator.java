package multithreads.volatilekeyword;

public class Numerator {



        private static int counter=0;

        public void getOrder(){
            String name=Thread.currentThread().getName();
            counter++;
            System.out.println("Sayın "+name+" sıranız: "+counter);
        }


}
