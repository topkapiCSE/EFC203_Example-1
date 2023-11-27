package animal;

import java.time.LocalDate;

public class Animal {

    /**
     * Hayvana ait yaş bilgisi
     */
    protected int age;

    /**
     * Hayvana ait isim bilgisi
     */
    protected String name;
    /**
     * Eklenen hayvanın eklendiği tarih/saat bilgilerini tutar.
     * Nesne oluşturulduğunda setlenir ve bir daha değiştirilemez.
     */
    protected final LocalDate createdAt;

    Animal(int age){
        this.age = age;
        createdAt = LocalDate.now();
    }

    public void makeNoise(){
        System.out.println("Tanimsiz Hayvan");
    }

}
