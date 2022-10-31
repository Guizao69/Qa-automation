class Switchcasestatement 

{

public static void main(string[] args)

{



java.util.Scanner sc=new java.util.Scanner(system.in);
system.out.println("Enter month number");
int a=sc.nextInt();

// how to use switch 

switch(a)
{
case 1:
case 11:
case 12:

system.out.println("Winter Season");
Break;
case 3:
case 4:
case 7:

system.out.println("summer season");
Break;
case 6:
case 8:
case 10:

system.out.println("spring season");
break;
default:
system.out.println("Invalid input")
       }
}
}