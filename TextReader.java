import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args) throws Exception
    {        
        File testFile=new File("Flights.txt");
        BufferedReader br=new BufferedReader(new FileReader(testFile));
        StringBuffer buffer=new StringBuffer();
        String str;
        while((str=br.readLine())!=null){
        buffer.append(str);
        buffer.append(" ");
        }
        ArrayList<String> list=new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(buffer.toString().toLowerCase());
                while(st.hasMoreTokens()) {
                        String s = st.nextToken();
                        list.add(s);
                }
        HashSet<String> set = new HashSet<String>(list);
        List<String> arrayList = new ArrayList<String>(set);
        Collections.sort(arrayList);
        for (Object ob : arrayList)
        System.out.println(ob.toString());
    }
}