import java.util.Scanner;
class SeesawSort{
    public static void main(String[] args) {
        System.out.println("How many elements would you like in the list?");
        Scanner s = new Scanner(System.in);
        int elements = s.nextInt();
        System.out.println("Input the elements into the array (make sure they aren't sorted)");
        int list [] =  new int[elements];
        for(int i = 0; i < list.length; i++){
            int thing = s.nextInt();
            list[i] = thing;
        }
        System.out.println("Sorting the array......");
        seesawSort(list);
    }

    public static void seesawSort(int [] arr){
        int swap = 0;
        int access = 0;
        boolean will = isSorted(arr);
         while(!will){
            int temp = 0;
            int left = 0;
            int right = arr.length - 1;
            while(left < right && !will){
                if(arr[left] > arr[left + 1]){
                temp = arr[left + 1];
                arr[left + 1] =  arr[left];
                arr[left] = temp;
                swap++;
                }
            left++;
            access++;
            will = isSorted(arr);
             }
        while(right > 0 && !will){
            if(arr[right - 1] > arr[right]){
            temp = arr[right];
            arr[right] = arr[right - 1];
            arr[right - 1] = temp;
            swap++;
          }
        right--;
        access++;
        will = isSorted(arr);
        }
       will = isSorted(arr);
      }
     System.out.print("Total number of array accesses: " + access + "\nTotal number of array swaps: " + swap);
      System.out.println();
     printArray(arr);
    }

  public static boolean isSorted(int [] list){
  boolean taylor = true;
    for(int i = 0; i < list.length - 1; i++){
        if(list[i] > list[i + 1]){
          taylor = false;
        }
    }
    return taylor;
    }

    public static void printArray(int [] list){
        for(int a = 0; a < list.length; a++){
            System.out.print(list[a] + " ");
        }
        System.out.println();
    }
}