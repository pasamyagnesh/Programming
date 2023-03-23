import java.util.Scanner;

class bikeRiders 
{
public static void main(String args[])
{

int r1,r2,r3,r4,r5;
float averageSpeed;

Scanner speed = new Scanner(System.in);

System.out.println("Enter the speed of 5 Bike Riders : ");

r1 = speed.nextInt();
r2= speed.nextInt();
r3= speed.nextInt();
r4= speed.nextInt();
r5= speed.nextInt();

averageSpeed =(r1+r2+r3+r4+r5)/5;
System.out.println("The averaeg speed : "+ averageSpeed);

if(averageSpeed <= r1)
{
System.out.println("r1 is Qualified ");
System.out.println("Average speed : " +r1);
}
if(averageSpeed<=r2)
{
System.out.println("r2 is Qualified");
System.out.println("Average speed :"+r2);
}
if(averageSpeed<=r3)
{
System.out.println("r3 is Qualified");
System.out.println("Average speed :"+r3);
}

if(averageSpeed<=r4)
{
System.out.println("r4 is Qualified");
System.out.println("Average speed :"+r4);
}
if(averageSpeed<=r5)
{
System.out.println("r5 is Qualified");
System.out.println("Average speed :"+r5);
}

}
}





