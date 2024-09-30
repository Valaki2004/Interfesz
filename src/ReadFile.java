import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class ReadFile implements readible {

    public void readContent() {
        try{
            tryReadContent();
        }catch(FileNotFoundException e){
            System.err.println("Hiba");
            System.err.println(e.getMessage());
        }
    }

    
    public void tryReadContent() throws FileNotFoundException { 
        File file = new File("Adat.txt");
        Scanner scanner =  new Scanner(file);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        
        }

        scanner.close();

    }
}
