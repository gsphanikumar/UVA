/**
 * Created with IntelliJ IDEA.
 * User: Phani
 * Date: 8/4/12
 * Time: 9:00 PM
 */
import java.util.Scanner;
class Main {
    static boolean first = true;
    private static String reformat(String s)
    {
        StringBuilder sb = new StringBuilder();
        char[] at = s.toCharArray();
        for(int i=0;i<at.length;i++)
        {
            if (at[i] == '\"')
            {
                if (first)
                   sb.append("``");
                else
                    sb.append("''");
                first = !first;
            }
            else
            sb.append(at[i]);
        }
      return sb.toString();
    }

    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            System.out.println(reformat(s.nextLine()));
        }
    }
}
