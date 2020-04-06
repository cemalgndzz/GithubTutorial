public class Deniyoruz {


    public static int multip(int a,int b)
    {
        return a*b;
    }

    public static int summ(int a,int b)
    {
        return a+b;
    }

    public static int division(int a,int b)
    {
        return a/b;
    }

    public static int substraction(int a,int b)
    {
        return a-b;
    }

    public static void main(String[] args)
    {
        int a= 50;
        int b= 20;
        int result ;
        System.out.println("Hello World");

        result = summ(a,b);
        System.out.println(summ(a,b));
        System.out.println(division(a,b));
        System.out.println(multip(a,b));

    }
}
