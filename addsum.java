import java.util.Scanner;
class addsum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of toys in your side :-  ");
        int tot=sc.nextInt();
        System.out.println(" Enter the number of toys you have to donate :- ");
        int donate=sc.nextInt();
        int rem=tot-donate;
        System.out.println("Remaining toys after the donate is : "+rem);

    }
}