public class ArrayType1 extends ArrayProcessor {

    public  ArrayType1() {

        setSearchBehavior(new BinarySearch() );
        setFilterBehavior(new GreaterFilter() ) ;
        setSortBehavior (new MergeSort()  ) ;
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
            getSortBehavior().Sort(arr);
            setSorted(true);
    }

}
