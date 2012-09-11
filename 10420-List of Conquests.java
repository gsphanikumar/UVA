import java.util.*;

class Main {

    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashMap hm = new HashMap(n);
        for(int i=0;i<=n;i++){
            String t = s.nextLine();
            if (t.equals(""))
                continue;
            String[] names = t.split(" ");
            String country = names[0];
            String woman_name = getWomanName(names);

            if(hm.containsKey(country))
            {
              data d = (data)hm.get(country);
              if(!d.names.contains(woman_name))
              {
                  d.names.add(woman_name);
                  d.count++;
                  hm.remove(country);
                  hm.put(country,d);
              }
            }
            else
            {
               data d1 = new data();
               d1.names.add(woman_name);
               d1.count++;
               hm.put(country,d1);
            }
        }
        String[] keys = (String[]) hm.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        for(String key:keys)
        {
            int count = ((data)hm.get(key)).count;
            System.out.println(key+" "+count);
        }

    }

    static String getWomanName(String[] names)
    {
        String n = "";
        for(int i=1;i<names.length;i++)
           n = n+ names[i]+" ";
        n = n.trim();
        return n;
    }

}

class data {
    ArrayList<String> names = new ArrayList(5);
    int count=0;
}

