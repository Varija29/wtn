import java.util.*;
class p27
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int temp=n;
int sum=0,r;
while(n>0)
{
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println("The sum of the digits of "+temp+" is "+sum);
}
}