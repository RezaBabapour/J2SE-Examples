public class Main {
    public static void main(String[] args) {
        Integer a = 1;
        Float b = 1.3f;
        Elastic<Integer, Float> tmp = new Elastic<>(a, b);
        System.out.println(tmp.toString());
    }
}
