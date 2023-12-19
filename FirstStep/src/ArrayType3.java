public class ArrayType3 extends ArrayProcessor {

    public  ArrayType3() {

        setSearchBehavior(new BinarySearch() );
        setFilterBehavior(new LessFilter() ) ;
        setSortBehavior (new InsertionSort()  ) ;
    }

    @Override
    public int search(int[] arr, int target) {
        return getSearchBehavior().search(arr , target) ;
    }

    @Override
    public int[] filter(int[] arr , int n ) {
        return getFilterBehavior().filter(arr , n ) ;
    }

    @Override
    public void sort(int[] arr) {
        if (isSorted() == false) {
            getSortBehavior().Sort(arr);
            setSorted(true);
        }
    }

}
