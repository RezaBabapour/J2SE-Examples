import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class sample {
    public void writeJSON() throws Exception
    {

        File f = new File("out.txt");
        FileWriter writer = new FileWriter(f);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "person1");
        jsonObject.put("age", new Integer(18));
        JSONArray list = new JSONArray();
        list.add("msg1");
        list.add("msg2");
        list.add("msg3");
        list.add("msg4");

        jsonObject.put("messages", list);
        writer.write(jsonObject.toString());
        writer.close();
    }

    public void readJSON() throws Exception
    {
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader("out.txt");
        int i = reader.read();
        String out = "";
        while (i != -1)
        {
            out = out + (char)i;
            i = reader.read();
        }

        JSONObject json = (JSONObject) parser.parse(out);
        System.out.println(json.get("name"));
        JSONArray msg = (JSONArray) json.get("messages");
        Iterator<String> iterator = msg.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
    public static void main(String[] args) throws Exception {
        sample obj1 = new sample();
        obj1.writeJSON();
        obj1.readJSON();


    }
}
