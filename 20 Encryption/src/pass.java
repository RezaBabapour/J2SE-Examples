import java.security.MessageDigest;
import java.util.Scanner;

public class pass {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String pass;
        System.out.print("Enter the password : ");
        pass = in.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(pass.getBytes());
        byte[] bytes = md.digest();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< bytes.length ;i++)
        {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println("result is : "+ sb.toString());
    }
}
