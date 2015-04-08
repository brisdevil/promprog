import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class  Lab3 {

    static String regexNotLetters = "[^а-яА-Я]+?";

    public static void main(String[] args) {
        String s = "Вадян пил вкусный чай и здорово работал теплой ночью, кидок.";
        System.out.println(getNumOfVerbs(s));
        System.out.println(getNumOfAdj(s));
        System.out.println(getNumOfAdv(s));
    }

    public static int getNumOfVerbs(String string) {
        String regexVerb = "[а-яА-Я]+?((ть)|(л)|(ла)|(ло)|(ли)|(шь)|(ет)|(ют)|(ят)|(аю))";
        Pattern p = Pattern.compile(regexVerb + regexNotLetters);
        Matcher m = p.matcher(string);

        int numOfVerbs = 0;
        while (m.find()) {
            System.out.println("We have found: " + m.group());
            numOfVerbs++;
        }

        return numOfVerbs;
    }

    public static int getNumOfAdj(String string) {
        String regexAdj;
        regexAdj = "[а-яА-Я]+?((ая)|(ое)|(ый)|(ые)|(ие)|(ий)|(ую)|(ого)|(его)|(ому)|(ему)|(им)|(ым)|(ой))";

        Pattern p = Pattern.compile(regexAdj + regexNotLetters);
        Matcher m = p.matcher(string);

        int numOfAdj = 0;
        while (m.find()) {
            System.out.println("We have found: " + m.group());
            numOfAdj++;
        }

        return numOfAdj;
    }

    public static int getNumOfAdv(String string) {
        String regexAdv = "[а-яА-Я]{2,}?о";

        Pattern p = Pattern.compile(regexAdv + regexNotLetters);
        Matcher m = p.matcher(string);

        int numOfAdv = 0;
        while (m.find()) {
            System.out.println("We have found: " + m.group());
            numOfAdv++;
        }

        return numOfAdv;
    }
}