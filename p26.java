import java.util.*;
class p26
{
public static void main(String args[])
{
if(args.length==0)
System.out.println("An integer number as argument is expected");
else
{
int n=Integer.parseInt(args[0]);
int temp,sum=0,r;
temp=n;
while(n!=0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.println(temp +" is a palindrome");
else 
System.out.println(temp +" is not a palindrome");
}
}
}