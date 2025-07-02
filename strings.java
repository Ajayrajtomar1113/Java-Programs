import java.util.Scanner;
public class strings {
   public static void main(String[] args)
   {
        
         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array : ");
//         int size = sc.nextInt();
//         String[] arr = new String[size];
//         int len = 0;
//         for(int i=0;i<size;i++)
//         {
//             arr[i] = sc.next();
//         }
//         System.out.println("Print String Array");
//         for(int i=0;i<size;i++)
//         {
//             System.out.println(i+1+"."+arr[i]);
//             len += arr[i].length();
//         }
//         System.out.println("Total Length = "+len);
    String str = sc.next();
    String result ="";
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)=='e')
        {
            result+='i';
        }
            else
            {
                result+=str.charAt(i);
            }
        
    }
    System.out.println(result);
   }
}