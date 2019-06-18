import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class cache {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://bp.swf.ir/");
        URLConnection con = url.openConnection();
        InputStream stream = con.getInputStream();
        int agent = stream.read();
        String content = "";

        while (agent != -1)
        {
            content = content + (char)agent;
            agent = stream.read();
        }
        stream.close();
        System.out.println(content);

    }
}
