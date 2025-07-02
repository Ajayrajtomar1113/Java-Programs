public class Recur {
    //Sum of n natural numbers

    // public static int sum(int n)
    // {
    //     if(n==0)
    //     {
    //         return 0;
    //     }
    //     return n + sum(n-1);
    // }
    // public static void fib(int n,int n1,int n2)
    // {
    //     if(n==0)
    //     {
    //         return;
    //     }
    //     int n3 = n1+n2;
    //     System.out.println(n3);
    //     fib(n-1,n2,n3);
    // }
    //Power of a number
    // public static int pow(int n,int p)
    // {
    //     if(p == 0)
    //     {
    //         return 1;
    //     }
    //     if(n == 0)
    //     {
    //         return 0;
    //     }
    //     return n * pow(n,p-1);
    // }
    // public static int pow2(int n,int p)
    // {
    //     if(p == 0)
    //     {
    //         return 1;
    //     }
    //     if(n == 0)
    //     {
    //         return 0;
    //     }
    //     if(p%2==0)
    //     {
    //         return pow(n,p/2) * pow(n,p/2);
    //     }
    //     else
    //     {
    //         return pow(n,p/2) * pow(n,p/2) * n;
    //     }
    // }
    public static void hanoi(int n,char from,char aux,char to)
    {
        if (n==1) {
            System.out.println("Move 1 disk from Tower " + from + " to Tower " +  to);
            return;
        }
        hanoi(n-1, from, to, aux);
            System.out.println("Move "+ (n-1) +" disk from Tower "+ from + " to Tower " + to);
        hanoi(n-1, aux, from, to);    
    }
    public static void main(String[] args) {
        // int n1 = 0;
        // int n2 = 1;
        // int n = 5;
        // System.out.println(n1);
        // System.out.println(n2);
        // fib(n-2,n1,n2);
        hanoi(4,'A','B','C');
    }
}
