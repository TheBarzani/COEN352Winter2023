public class Bubblesort {
    static void bubblesorting(int[] a) {
        int n = a.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(a[j-1] > a[j]){
                    //swap elements
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int a[] ={2,30,55,22,5,547,97};

        System.out.println("Before Bubble Sort");
        for(int i=0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        bubblesorting(a);

        System.out.println("After Bubble Sort");
        for(int i=0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

    }
}