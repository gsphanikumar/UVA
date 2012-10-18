import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sample {
    public static void main(String args[] ) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int no_of_tests = Integer.parseInt(in.readLine());
        String str;
        for(int i=0;i<no_of_tests;i++)
        {
            int max =0;
            StringBuilder output = new StringBuilder();
            for(int j=0;j<10;j++)
            {
               String[] tmp = in.readLine().split(" ");
               if(Integer.parseInt(tmp[1]) > max){
                   output = new StringBuilder();
                   output = output.append(tmp[0]);
                   max = Integer.parseInt(tmp[1]);
               }
               else if(Integer.parseInt(tmp[1]) == max) {
                   output.append(",");
                   output.append(tmp[0]);
               }
            }
            String[] res = output.toString().split(",");
            System.out.println("Case #"+(i+1)+":");
            for(int z=0;z<res.length;z++)
                System.out.println(res[z]);
        }
    }
}