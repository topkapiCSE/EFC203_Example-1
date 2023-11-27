package screen;

import animal.Cat;
import animal.Dog;

class AddScreen extends Screen{

    AddScreen(){

        int input = -1;
        while (input == -1){
            clear();
            println();
            System.out.println("1 - Kedi Ekle");
            System.out.println("2 - Kopek Ekle");
            System.out.println("3 - Geri");
            println();
            input = super.input.getInt(1,3);
            if(input == -1){
                clear();
                continue;
            }

            switch (input){
                case 1: addCat(); break;
                case 2: addDog(); break;
            }

            if(input != 3){
                input = -1;
            }
        }
    }

    private void addCat(){
        System.out.print("Kedinin yasi : ");
        int age = input.getPositiveInt();
        animalList.add(new Cat(age));
    }

    private void addDog(){
        System.out.print("Kopegin yasi : ");
        int age = input.getPositiveInt();
        animalList.add(new Dog(age));
    }
}
