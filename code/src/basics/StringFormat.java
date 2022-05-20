package basics;

public class StringFormat {
    public static void main(String[] args) {
        float a = 453.12356f;
        System.out.printf("Formatted string: %.2f", a);
        System.out.println();

        System.out.printf("Pie value: %.3f", Math.PI);
        System.out.println();

        System.out.printf("Good %s. Hello %s!", "Morning", "Maya");

        System.out.println();

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // integer will be converted to Integer which will call toString method
        // "a" + "1"

        System.out.println();

        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.println(ch);
            series += ch;
        }
        System.out.println(series);
        System.out.println();

        //Using string builder

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }

        System.out.println(builder);
        System.out.println(builder.capacity());
        System.out.println(builder.reverse());
        System.out.println(builder.length());

    }
    
}