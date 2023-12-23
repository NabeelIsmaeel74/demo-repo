public class LinearSearch implements SearchBehavior {
    @Override
    public int search(int[] arr, int target) {
        int n  = arr.length ;

        for (int i = 0 ; i <n; i++)
            if (arr[i] == target)
                return  i ;

        return  -1 ;
    }

}
