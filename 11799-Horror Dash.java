import java.util.*;

class Main {

    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int no_of_tests = s.nextInt();
        for(int i=1;i<=no_of_tests;i++){
            int no_of_participants = s.nextInt();
            int max = 0;
            for(int j=1;j<=no_of_participants;j++)
            {
               max = Math.max(max,s.nextInt());
            }
            System.out.println("Case "+i+": " +max);
        }
    }


}

