package storage;
import animal.Animal;
import animal.Cat;
import animal.Dog;

import java.util.ArrayList;

public class AnimalList extends ArrayList<Animal> {

    /**
     * Kaydedilebilecek maksimum hayvan sayısını belirler. Örnek kodda bu değer kullanılmamaktadır.
     */
    private int limit;
    private int countOfCats;
    private int countOfDogs;
    AnimalList(int limit){
        if( limit > 0 ){
            this.limit = limit;
        }else {
            this.limit = -1;
        }
    }
    public AnimalList(){
        limit = -1;
    }

    /**
     *
     * @description Arraylist'e ekleme yapılır. Ekleme sırasında instanceof keyword'ü kullanılarak Animal üst sınıfı türünde verilen parametrenin,
     *                  aslında hangi Animal türünde bir nesne olduğu tespit edilir. Böylelikle listede bulunan Kedi ve Köpek sayısı tutulur
     *
     * @param animal Listeye eklenmek istenen hayvan parametresi.
     *               Polymorphism özellikleri sayesinde burada parametreyi spesifik olarak "Cat" ya da "Dog" türünde yapmamız gerekmiyor.
     *               Cat ve Dog aynı zamanda bir Animal olduğu için burada bir type-casting uygulamamıza imkan sağlıyor.
     * @return ekleme işlemi başarılıysa true döner. Liste için bir limit belirlenip, bu limitten daha fazla hayvan eklenmesinin önüne geçebiliriz
     */
    @Override
    public boolean add(Animal animal) {
        if (limit == -1){
           if(super.add(animal)){
               if (animal instanceof Cat){
                   countOfCats++;
               }else if(animal instanceof Dog){
                   countOfDogs++;
               }
           return true;
           }
        }
        if(limit > 0 && size() < limit){
            if(super.add(animal)){
                if (animal instanceof Cat){
                    countOfCats++;
                }else if(animal instanceof Dog){
                    countOfDogs++;
                }
                return true;
            }
        }
        return false;
    }

    public void printAll(){
        for (int i=0;i<size();i++)
            System.out.println((i+1) + " - " + get(i).toString());
    }

    @Override
    public void clear() {
        countOfDogs = 0;
        countOfCats = 0;
        super.clear();
    }

    public void printStatics(){
        System.out.println("_____________________________");
        System.out.println("Kedi  adet :" + countOfCats);
        System.out.println("Kopek adet :" + countOfDogs);
        System.out.println("Toplam :" + size());
        System.out.println("_____________________________");
    }

    public void makeNoise() {
        for (int i=0;i<size();i++){
            System.out.print( i + " - ");
            get(i).makeNoise();
        }

    }
}
