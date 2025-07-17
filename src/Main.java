import java.io.File;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int count = 0;
        do{
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (isDirectory) {
                System.out.println("Это путь к папке, а не к файлу. Попробуйте еще раз");
                continue;
            }
            if(!fileExists){
                System.out.println("Файл не существует. Попробуйте еще раз.");
            } else {
                count++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер "+count);
            }
        }
        while(true);
    }
}
