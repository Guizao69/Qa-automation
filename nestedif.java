class conditional3

{

public static void main(string[] args)

{

//if condtional statement

java.util.Scanner sc=new java.util.Scanner(system.in);
system.out.println("Enter 1st number");
int a=sc.nextInt();

if (a%2==0)

{
if (a%5==0)
{

 system.out.println("Number is divisible by 2 but not by 5  ");

}
else {

system.out.println("Number is divisible by 5  but not by 2 ");

}
else {

system.out.println("Number is not divisible by 2 and 5 ");
}


}

}