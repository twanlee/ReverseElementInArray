import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = sc.nextInt();
            if(size>20) System.out.println("Size does not exceed 20");
        }while (size>20);

        array = new int[size];
        int i = 0;
        for(i=0; i<size; i++){
            System.out.println("Enter value "+ (i+1)+"; ");
            array[i] = sc.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for(int j=0; j<array.length/2; j++){
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for(i=0; i<array.length; i++){
            System.out.println(array[i] + "\t");
        }
    }
}
