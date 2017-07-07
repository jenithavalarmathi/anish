import java.util.*;
import java.io.*;

public class Power{
   public static void main(String args[]){
   int n=0,p=0,pow=0;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number:");
     n=s.nextInt();
     System.out.println("Enter the power:");
     p=s.nextInt();
     System.out.println(pow(n,p));
  }
    public static int pow(int n,int p)
    {
      int pow=1,a;
      for(a=0;a<p;a++)
      pow=pow*n;
      return pow;
    }
}

