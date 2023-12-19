public class BubbleSort implements SortBehavior{

    @Override
    public void Sort(int[] arr) {
        int n = arr.length  , temp ;

        for (int i = 0 ; i <n-1 ; i++) {
            boolean ok = false ;
            for (int j = 0 ; j< n-i-1 ; j++) {
                if (arr[j]  > arr[j+1]) {
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                    ok = true ;
                }
            }

            if (ok == false )
                break;
        }
    }

}
