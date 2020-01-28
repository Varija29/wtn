import java.util.*;
import java.io.*;
class P24{
 public static void main(String args[]){
 int a=Integer.parseInt(args[0]);
 int rev=0;
 while(a!=0)
 {
  int rem=a%10;
  rev=rev+rem;
  a=a/10;
 }
 System.out.println("The sum of the digits of "+args[0]+" is "+rev);
 }
}