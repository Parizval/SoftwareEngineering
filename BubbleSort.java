import java.util.Scanner;

public class BubbleSort {

    public static int[] BubbleSort(int[] arr)
    {
        boolean check = true;
            while (check)
            {
                int temp = 0 ;
                check = false;
                for (int i = 0; i < arr.length-1 ; i++) {
                    if (arr[i] > arr[i+1])
                    {
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        check = true;
                    }
                }
            }
            return arr;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n ;

        System.out.print("Enter no. of elements you want in array: ");
        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements: ");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }

        int[] answer = RecursiveBubbleSort(a,a.length);

        System.out.println("Sorted Elements: ");

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + "  ");
        }
    }
}
