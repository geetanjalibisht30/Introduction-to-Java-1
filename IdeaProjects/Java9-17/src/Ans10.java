import java.util.Arrays;

public class Ans10 {
    public static void main(String[] args) {
        String s = "Geetanjali Bisht";
        System.out.println("--------------repeat()---------------------");
        System.out.println(s.repeat(4));

        String s1 = "\t\n  Jvm \u2005";
        System.out.println("-------------------strip()--------------------");
        System.out.println(s1.strip());

        String s2="\n\t ";
        System.out.println("-------------------isBlank()--------------------");
        System.out.println(s2.isBlank());

        System.out.println("-------------------indent()--------------------");
        System.out.println(s.indent(10));

        System.out.println("-------------------transform()--------------------");
        String n = s.transform(string -> string.split(" ")[0]);
        System.out.println(n);


        String s3 = "\tjava\n"
                + "\t\t9-17\n"
                + "\tFeatures\n";
        System.out.println("-------------------stripIndent()--------------------");
        System.out.println(s3.stripIndent());

        String s4 ="Hello\nWorld";
        System.out.println("-------------------translateEscape()--------------------");
        System.out.println("Without translateEscapes :  " + s4);
        System.out.println("With translateEscape : " + s4.translateEscapes());

        System.out.println("-------------------formatted string()--------------------");
        System.out.println("Java %s".formatted(8));

    }
}
