public class p4
{
public static void main(String args[])
{
if(args.length==0)
System.out.println("An integer number as argument is expected");
else
{
if(Integer.parseInt(args[0])>0)
System.out.println(args[0]+" is a positive number");
else if(Integer.parseInt(args[0])<0)
System.out.println(args[0]+" is a negative number");
else  if(Integer.parseInt(args[0])==0)
System.out.println(args[0]+" is a neither negative nor positive ");
}
}
}