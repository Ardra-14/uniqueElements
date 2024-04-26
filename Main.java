
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        if (size == 0){
            System.out.println("Array size is zero.");
            return;
        }

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");

        try {
            for (int i = 0; i<size;i++){
                arr[i] = s.nextInt();
            }
            DuplicateElement d = new DuplicateElement();
            d.process(arr);
        }catch (NegativeNumberExceptions e){
            System.out.println(e.getMessage());
        }
    }
}