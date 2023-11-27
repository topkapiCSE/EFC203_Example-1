package screen;

public class DeleteScreen extends Screen{

    DeleteScreen(){

        clear();
        int input = -1;
        while (input == -1){
            println();
            System.out.println("1 - Listeden Secerek Sil");
            System.out.println("2 - Tumunu Sil("+ animalList.size()+")");
            System.out.println("3 - Geri");
            println();
            input = super.input.getInt(1,3);
            if(input == -1){
                clear();
                continue;
            }

            switch (input){
                case 1: deleteFromList(); break;
                case 2: deleteAll(); break;
            }

            if(input != 3){
                input = -1;
            }
        }
    }

    private void deleteFromList() {
        clear();
        animalList.printAll();
        int id = input.getInt(1, animalList.size());

        if(id != -1){
            animalList.remove(id-1);
        }
    }

    private void deleteAll() {
        animalList.clear();
    }
}
