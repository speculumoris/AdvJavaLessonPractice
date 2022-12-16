package Serialization;

import java.io.*;

//TASK: Book tipinde nesneler üretip bu nesneleri
    //books.txt dosyasına kaydedin ve sonra bu dosyadan nesneleri okuyun
public class SerializationPractice {
    public static void main(String[] args) {

        writeObject();
        readObject();

    }

    public static void writeObject(){
        Book book1=new Book("Sefiller","Victor Hugo",1945);
        Book book2=new Book("Suc ve Ceza","Dostoevski",1955);
        Book book3=new Book("Sefiller","Tolstoy",1940);

        try(FileOutputStream fos=new FileOutputStream("books.txt")){
            try(ObjectOutputStream oos=new ObjectOutputStream(fos)){
                oos.writeObject(book1);
                oos.writeObject(book2);
                oos.writeObject(book3);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static  void readObject(){


        try {
            FileInputStream fis = new FileInputStream("books.txt");

            ObjectInputStream ois=new ObjectInputStream(fis);

            Book book1=(Book)ois.readObject();
            Book book2=(Book)ois.readObject();
            Book book3=(Book)ois.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);

            ois.close();
            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
