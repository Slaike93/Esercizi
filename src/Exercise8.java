import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Exercise8 {
    public static boolean createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                System.out.println("Il file esiste");
                return false;
            } else {
                file.createNewFile();
                System.out.println("File creato: " + file.getName());
                return true;
            }
        } catch (IOException e) {
            System.out.println("Errore");
            e.printStackTrace();
            return false;
        }
    }

    public static boolean writeToFile(String fileName, String content) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("Il file non esiste");
                return false;
            }
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("Scrittura sul file avvenuta con successo");
            return true;
        } catch (IOException e) {
            System.out.println("Errore");
            e.printStackTrace();
            return false;
        }
    }

    public static String readFromFile(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("Il file non esiste");
                return "";
            }
            Scanner reader = new Scanner(file);
            StringBuilder fileContent = new StringBuilder();
            while (reader.hasNextLine()) {
                fileContent.append(reader.nextLine()).append("\n");
            }
            reader.close();
            return fileContent.toString();
        } catch (IOException e) {
            System.out.println("Errore");
            e.printStackTrace();
            return "";
        }
    }
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        String content = "Hello world!";

        // Test file creation
        boolean isFileCreated = createFile(fileName);
        System.out.println("File creato: " + isFileCreated);

        // Test writing to file
        boolean isWrittenToFile = writeToFile(fileName, content);
        System.out.println("Contenuto scritto sul file: " + isWrittenToFile);

        // Test reading from file
        String fileContent = readFromFile(fileName);
        System.out.println("Contenuto letto dal file: " + fileContent);
    }
}
