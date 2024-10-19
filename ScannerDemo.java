import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("demo.txt");
        Scanner abcd = new Scanner(file);
        // System.out.printl;
        System.out.println("Please enter your Phone");
        int phone = abcd.nextInt();
        System.out.println("the entered name is :" + phone);
        System.out.println("Please enter your name");
        String name = abcd.next();
        System.out.println("the entered name is :" + name);
        abcd.close();

        
        
}
}