
import java.util.*;
@SuppressWarnings("unused")
public class stringbulder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
for(char ch='a';ch<='z';ch++)
{
    sb.append(ch);
}
System.err.println(sb);
    }
}
