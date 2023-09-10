
package benz;

public class one_to_five {

////////////////q1
public static int one (int n) {

if (n==1) {
return 1;
}

return n+one(n-1);
}

/////////////q2

public static int two (int n) {

if (n==1) {
return 1;
}

return n*two(n-1);
}

//////////q3
public static int three (int n) {

if(n%2==0) {
n=n-1;
}

if (n==1) {
return 1;
}

return n*three(n-2);
}

//////////q4
public static int four (int n) {


if (n<10) {
return 1;
}

return 1+four(n/10);
}

//////////q5
public static int five (int n,int x) {


if (n<x) {
return 0;
}

else {
return 1 + five(n - x, x);
}
}

//////////q9
public static boolean nine(int n) {
       if (n < 10) {
           return n % 2 == 0;
       }

       int ldigit = n % 10;
       int restnum = n / 10;

       return (ldigit % 2 == 0) == nine(restnum);
   }

public static void main(String[] args) {

int n = 13;
int x=7;
System.out.println("question 1:  " +one(n));

System.out.println("question 2:  " +two(n));

System.out.println("question 3:  " +three(n));

System.out.println("question 4:  " +four(n));

System.out.println("question 5:  " +five(n,x));

System.out.println("question 9 bonus:  " +nine(n));
}

}
