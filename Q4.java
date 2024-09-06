import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        String x=src.nextLine();
        int s=x.length();
        int count=0;
        for(int i=0;i<s;i++)
        {
            char c=x.charAt(i);
            if(c==' ')
            {
                count++;
            }
        }
        System.out.println(" "+count);
    }
    
}
