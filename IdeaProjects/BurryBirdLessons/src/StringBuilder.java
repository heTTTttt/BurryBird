
public class StringBuilder {
    public static void main(String[] args) {
        String x = "Hello";
        x = x.toUpperCase();
        System.out.println(x);
        System.out.println("---------------");
        String string1 = "Hello ";
        String string2 = "my ";
        String string3 = "friend";
        String stringAll = string1+string2+string3;
        System.out.println(stringAll);
        System.out.println("---------------");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" my").append(" friend");
        System.out.println(sb);
    }
}
