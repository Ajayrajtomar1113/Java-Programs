import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter "+(i+1)+" Nummber : ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to be search : ");
        int target = sc.nextInt();
        for(int j=0;j<size;j++)
        {
            if(target==arr[j])
            {
                System.out.println("Target found at Index = "+j);
            }
        }
    }
}
