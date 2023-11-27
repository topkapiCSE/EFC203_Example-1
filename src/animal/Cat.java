package animal;

public class Cat extends Animal{

    public Cat(int age){
        super(age);
    }

    public void makeNoise(){
        System.out.println("Miyav!..");
    }

    @Override
    public String toString() {
        return "Kedi  - yas: " + age + "  kayit tarihi : " + createdAt.toString();
    }
}
