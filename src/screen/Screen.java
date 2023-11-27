package screen;

import io.Input;
import storage.AnimalList;

/**
 * Yalnızca screen paketinden erişilebilsin diye "public" olarak tanımlanmayan sınıf
 */
class Screen {
    protected static AnimalList animalList = new AnimalList();
    protected Input input;
    Screen(){
        input = new Input();
    }

    protected void println(){
        System.out.println("**********************");
    }

    protected void clear(){
        for (int i=0;i<50;i++)
            System.out.println();
    }
    protected void clear(int countOfLine){
        for (int i=0;i<countOfLine;i++)
            System.out.println();
    }
}
