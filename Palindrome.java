import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {
        int sum=0,rem,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    temp=n;
    while(n>0)
    {
        rem=n%10;
        sum=sum*10+rem;
        n=n/10;
    }
    if(sum==temp)
    {
        System.out.println("palindrome");
    }
    else
    {
       System.out.println("not palindrome");
    }
    }
}