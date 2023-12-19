public class InsertionSort implements  SortBehavior{

    @Override
    public void Sort(int[] arr) {
        int n  = arr.length ;

        for (int i =  1 ; i<n ; i++) {
            int cur = arr[i] ,  j = i -1 ;

            while (j>=0 && arr[j] > cur) {
                arr[j+1] = arr[j] ;
                j-- ;
            }

            arr[j+1] = cur ;
        }
    }


}
