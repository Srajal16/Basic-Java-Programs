public class methodOverloading {

    static int area(int l , int b){
        return l*b;
    }

    static float area(double r){
        return (float) (Math.PI*r*r);
    }

    public static void main(String[] args) {

        int a =10 , b = 20 , c =20;
        System.out.println("Area of rectangle: "+area(10,20));
        System.out.println("Area of circle: "+area(c));

    }
}
/*
package scmethod2;

public class SCMethod2
{


    boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }


    boolean validate(int age)
    {
        return age>=3 && age<=15;
    }


    int reverse(int n)
    {
        int rev=0;

        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }


    int [] reverse(int A[])
    {
        int B[]=new int[A.length];

        for(int i=A.length-1,j=0;i>=0;i--,j++)
            B[j]=A[i];

        return B;
    }

    public static void main(String[] args)
    {

    }




    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }

    static double area(double length,double breadth)
    {
        return length*breadth;
    }


}
 */