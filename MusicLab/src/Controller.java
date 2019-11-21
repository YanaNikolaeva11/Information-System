import java.io.IOException;

public class Controller {
    public static void Process() throws IOException{
        boolean cercle = true;
        boolean cercle1 = true;
        boolean cercle2 = true;
        boolean cercle3 = true;
        boolean cercle4 = true;
        while(cercle){
            while (cercle1){
               View.printMenu1();
               int key = System.in.read();
                switch (key)
                {
                    case 49://Просмотр
                        cercle1 = false;
                        cercle2 = true;

                        break;
                    case 50: //Открытие на чтение и запись
                        cercle1 = false;
                        cercle3 = true;
                    case 51: //Cохранение файла

                        break;
                    case 52:// Удаление файла

                        break;
                    case 27://ESC

                        cercle = false;
                        cercle1 = false;
                        cercle2 = false;
                        cercle3 = false;
                        cercle4 = false;
                        break;
                }
            }
            while (cercle2){
                //Runtime.getRuntime().exec("cls");
                View.printMenu21();
                int key = System.in.read();
                switch (key) {
                    case 49://Поиск трека
                        break;
                    case 50: //сортировка треков
                        break;
                    case 27://ESC
                        cercle2 = false;
                        cercle1 = false;
                        break;
                }

            }
            while(cercle3){

            }
        }
    }

}
