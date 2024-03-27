import java.util.StringTokenizer;
public class simple {

    public static void main(String args[])
    {
        StringTokenizer st=new StringTokenizer("my name is sairaj"," ");
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}