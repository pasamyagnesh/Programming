import java.util.*;



class random
{

public static void main(String args[])
{

int mean,m,i,sum=0,upperBound=100,quotient;
int t1,t2,t3,t4,t5,t6,t7,t8,t9,t0;

Random r = new Random();

for(i=0;i<100;i++)
{
m=r.nextInt(upperBound);
if(i==49){

System.out.println(" "+m);


}
else{
System.out.print(" "+m);
}

quotient = m%10;

switch(quotient) {
case 0:

t0=t0+1;

case 1:

t1=t1+1;

case 2:

t2=t2+1;

case 3:

t3=t3+1;

case 0:

t4=t4+1;


case 5:

t5=t5+1;

case 6:

t6=t6+1;

case 7:

t7=t7+1;

case 8:

t8=t8+1;

case 9:

t9=t9+1;






}

sum=sum+m;
}

mean=sum/50;
System.out.println("Sum : "+sum);
System.out.println("Mean : " +mean);
System.out.println("0 - 10 : " +t0);
System.out.println("0 - 10 : " +t0);

System.out.println("0 - 10 : " +t0);

System.out.println("0 - 10 : " +t0);
System.out.println("0 - 10 : " +t0);

System.out.println("0 - 10 : " +t0);

System.out.println("0 - 10 : " +t0);

System.out.println("0 - 10 : " +t0);

System.out.println("0 - 10 : " +t0);






}
}
