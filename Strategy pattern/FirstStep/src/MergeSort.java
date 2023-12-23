public class MergeSort implements  SortBehavior{

    @Override
    public void Sort(int[] arr) {
        sort(arr ,  0 , arr.length -1 );
    }

    private void  sort(int [] arr , int l , int r ) {
        if (l<r) {
            int mid = (l+r) /2  ;
            sort(arr,  l, mid );
            sort(arr ,  mid +1  ,r);
            merge(arr ,  l  , mid , r ) ;
        }
    }

    private void merge(int [] arr , int l  , int mid , int r) {
        int n  = mid-l+1   , m  = r - mid ;
        int [] L = new int[n]   , R = new int[m];

        for (int i = 0 ; i<n ; i++)
            L[i] = arr[i + l ] ;

        for (int i = 0 ; i<m ; i++)
            R[i] = arr[i+mid+1] ;


        int i = 0 , j = 0 , k  = l   ;

        for ( ; i<n && j<m ; ) {
            if (L[i] <= R[j])
                arr[k] = L[i++] ;
            else
                arr[k] = R[j++] ;
            k++ ;
        }

        for ( ; i<n ; i++)
            arr[k++] = L[i] ;

        for ( ; j<m ; j++)
            arr[k++] = R[j] ;
    }

}
