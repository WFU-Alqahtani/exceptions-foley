import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4,5};
        Scanner index = new Scanner(System.in);
        System.out.println("Enter the index of the array to print its content");
        int x = index.nextInt();
        try{
            System.out.println(arr[x]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The program has an exception: " + e);
        }
        System.out.println(arr[x]);
    }
}