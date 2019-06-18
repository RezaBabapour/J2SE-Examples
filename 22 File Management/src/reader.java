import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class reader {
    public static void main(String[] args) throws IOException {
        File tmp = new File("tmp.txt");
        FileReader reader = new FileReader(tmp);
        int i = reader.read();
        String alp = "";
        while (i != -1)
        {
            alp = alp + (char)i;
            i = reader.read();
        }
        System.out.println(alp);
        reader.close();
    }
}
