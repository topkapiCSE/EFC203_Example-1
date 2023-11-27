package animal;

public class Dog extends Animal {

    public Dog(int age){
        super(age);
    }

    public void makeNoise(){
        System.out.println("Hav hav!..");
    }
    @Override
    public String toString() {
        return "Kopek - yas: " + age + "  kayit tarihi : " + createdAt.toString();
    }

}
