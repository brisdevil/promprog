import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Lab3 {

    static String regexNotLetters = "[^а-яА-Я]+?";

    public static void main(String[] args) {
        String s = "Вадян пил вкусный чай и здорово работал теплой ночью, кидок.";
        System.out.println(getNumOfVerbs(s));
    }

    public static int getNumOfVerbs(String string) {
        String regexVerb = "[а-яА-я]+?((ть)|(л)|(ла)|(ло)|(ли)|(шь)|(ет)|(ют)|(ят)|(аю))";
        Pattern p = Pattern.compile(regexVerb + regexNotLetters);
        Matcher m = p.matcher(string);
        int numOfVerbs = 0;
        while (m.find()) {
            System.out.println("found: " + m.group());
            numOfVerbs++;
        }
        return numOfVerbs;
    }
}