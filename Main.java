import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] names = {"Adam", "Hank", "Ike", "John", "Jack", "Paul", "Peter", "Roger", "Roger", "Victor", "Walter"};
        String[] selectedNames = new String[35];
        Random rand = new Random();
                
        for (int i = 0; i < 35; i++) {
            int randomIndex = rand.nextInt(names.length);
            selectedNames[i] = names[randomIndex];
        }
        FileWriter writer = new FileWriter("myFile.txt");
        for (String name : selectedNames) {
            writer.write(name + "\n");
        }
        writer.close();
           
        String[] sortedNames = new String[35];
        FileReader fr = new FileReader("myFile.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        int i=0;
        while((line = br.readLine())!=null){
            sortedNames[i++] = line;
        }
        br.close();
        fr.close();
                
                Arrays.sort(sortedNames);
                FileWriter writer2 = new FileWriter("myFile2.txt");
                for (String name : sortedNames) {
                    writer2.write(name + "\n");
                }
                writer2.close();
        
    }
}
