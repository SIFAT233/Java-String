import java.util.Scanner;
public class Q3{
    
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        String s=src.nextLine();
        StringBuffer ok =new StringBuffer(s.toLowerCase());
        int vowelCount=0;
         
        int p=ok.length();
        for(int x=0;x<p;x++){
             char ch=ok.charAt(x);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
               vowelCount++;  
       }
    }
        
             
    
        System.out.println(" "+vowelCount);
    
}}
