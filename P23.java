import java.util.*;
import java.io.*;
class P23{
 public static void main(String args[]){
 int a=Integer.parseInt(args[0]);
 int rev=0;
 int b=a;
 while(a!=0)
 {
  int rem=a%10;
  rev=rev*10+rem;
  a=a/10;
 }
 if(rev==b)
 System.out.println(b+" is a palindrome");
 else
 System.out.println(b+" is not a palindrome");
 }
}