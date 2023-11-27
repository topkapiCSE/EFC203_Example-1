package screen;

public class ListScreen extends Screen{

    ListScreen(){

        clear();
        int input = -1;
        while (input == -1){
            clear(4);
            println();
            System.out.println("1 - Tumunu yazdir("+ animalList.size()+")");
            System.out.println("2 - Istatistik yazdir");
            System.out.println("3 - Tum hayvanlar ses cikartsin");
            System.out.println("4 - Geri");
            println();
            input = super.input.getInt(1,3);
            if(input == -1){
                clear();
                continue;
            }

            switch (input){
                case 1: animalList.printAll(); break;
                case 2: animalList.printStatics(); break;
                case 3: animalList.makeNoise(); break;
            }
            if(input != 4){
                input = -1;
            }
        }
    }

}