public class p5
{
 public static void main(String args[])
{
int c=0;
 if(args.length==0)
 System.out.println("Please enter an integer number");
 else
{
 if(Integer.parseInt(args[0])==0||Integer.parseInt(args[0])==1)
 System.out.println(args[0]+" is neither prime nor composite");
 else{
 for(int i=2;i<=Math.sqrt(Integer.parseInt(args[0]));i++){
 if(Integer.parseInt(args[0])%i==0)
 c++;
 }
 if(c>0)
 System.out.println(args[0]+" is not a prime number");
 else
 System.out.println(args[0]+" is a prime number");
}
 }
}
}
