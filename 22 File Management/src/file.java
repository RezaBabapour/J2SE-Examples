import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class file {
        public static void main(String[] args) throws IOException {
            File f =    new java.io.File("/home/");
            System.out.println(f.getFreeSpace()/1024/1024/1024);
            String[] files = f.list();
            for (String str: files)
            {
                System.out.println(str);
            }
            f = new File("tmp.txt");
            FileWriter writer = new FileWriter(f);
            writer.write("hello\nthere");
            writer.flush();// write in file without close it
            writer.close();

        }
}


