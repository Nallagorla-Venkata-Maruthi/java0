package inputoutput;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile{
    public static void main(String[] args) {
        BufferedReader reader=null;
        try {
            reader=new BufferedReader(new FileReader("test.txt"));
            String line;
            while((line = reader.readLine())!= null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
            System.out.println("Error while reading test.txt");
            e.printStackTrace();
        }
        finally 
        {
            try 
            {
                if (reader!= null) {
                    reader.close();
                    System.out.println("File closed successfully.");
                }
            } 
            catch (IOException e) 
            {
                System.out.println("Error while closing the file!");
                e.printStackTrace();
            }
        }
    }
}
