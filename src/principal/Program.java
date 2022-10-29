import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("EWnter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath); 

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent()); 
        System.out.println("getPath: " + path.getPath());   // forma de exibir o caminho de um arquivo e o arquivo

        sc.close();



    }

}