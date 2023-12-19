public class BinarySearch implements  SearchBehavior{

    @Override
    public int search(int[] arr, int target) {
        int l = 0 ,   r =arr.length - 1  , mid ;

        while (l<=r) {
            mid = (l+r)/ 2  ;
            if (arr[mid] == target)
                return  mid ;
            else if (arr[mid] < target)
                l= mid +1  ;
            else
                r= mid-1 ;
        }

        return  -1 ;
    }
}
