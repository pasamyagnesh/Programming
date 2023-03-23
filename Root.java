import java.util.*;
import java.lang.*;

class Root
{

public static void main(String args[])
{
int a,b,c;
double result1,result2;
double nature;

Scanner root = new Scanner(System.in);

System.out.println("Enter a,b,c values: ");

a= root.nextInt();
b= root.nextInt();
c=root.nextInt();

double initialPower =b*b -4*a*c;

double power =Math.pow(initialPower, 1/2);

result1 =((-b + power)/(4*a));
result2 =((-b - power)/(4*a));

double naturePow = Math.pow(b,2);
nature = naturePow- 4*a*c;


if(nature >0)
{
System.out.println("Real roots");
}
if (nature <0)
{
System.out.println("Imaginary roots");
}

System.out.println("Root 1 value is :  " +result1);
System.out.println("Root 2 value is :  " + result2);

System.out.println("Desriminent = " + nature);




}
}







