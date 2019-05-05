package conversion;

public class App {
    public static void main(String[] args) {
        String tmp = "6457";
        int i = Integer.parseInt(tmp);
        float f = Float.parseFloat(tmp);    //can use for other types
        System.out.println("i = " + i);
        String b = String.valueOf(i);
        System.out.println("String b = " + b);
    }

}
