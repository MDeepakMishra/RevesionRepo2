public class removeWhiteSpace {
    public static void main(String[] args) {
        String s="My self Deepak Mishra";
        s = s.replaceAll("\\s+", "");
        System.out.println(s);
    }
}
