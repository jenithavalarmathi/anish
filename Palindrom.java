import java.util.*;
import java.io.*;

public class Palindrom{
   public static void main(String args[]){
   int n,j,sum=0;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number:");
     n=s.nextInt();
     while(n>0)
     {
      j=n%10;
      sum=(sum*10)+j;
      n=n/10;
      }
      if(n==sum)
      {
      System.out.println(sum+" is palindrom");
      }
      else
      {
        System.out.println(sum+" is not palindrom");
      }
  }
}

