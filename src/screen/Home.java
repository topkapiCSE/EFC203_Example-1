package screen;

public class Home extends Screen{

    public Home(){

        int input = -1;

        while (input == -1){
            clear();
            println();
            System.out.println("1 - Yeni Ekle");
            System.out.println("2 - Listele");
            System.out.println("3 - Kayit Sil");
            System.out.println("4- Cikis");
            println();
            input = super.input.getInt(1,4);
            if(input == -1){
                clear();
                continue;
            }

            switch (input){
                case 1: new AddScreen();    break;
                case 2: new ListScreen();   break;
                case 3: new DeleteScreen(); break;
            }
            if(input != 4){
                input = -1;
            }
        }

    }

}
