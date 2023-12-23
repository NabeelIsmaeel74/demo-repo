public class ArrayProcessor {
    private  SearchBehavior searchBehavior ;
    private  FilterBehavior filterBehavior ;
    private SortBehavior sortBehavior ;
    private  boolean sorted = false  ;

    public void display(int [] arr ) {
        if (arr.length == 0 ) {
            System.out.println("is empty");
        } else {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.print("\n");
        }
    }

    public  void   sort(int [] arr  ) {}

    public  int search( int [] arr ,int target)  {
        return  0 ;
    }

    public  int [] filter(int [] arr , int n   ) {
        return  arr ;
    }

    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    public void setFilterBehavior(FilterBehavior filterBehavior) {
        this.filterBehavior = filterBehavior;
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    public SearchBehavior getSearchBehavior() {
        return searchBehavior;
    }

    public FilterBehavior getFilterBehavior() {
        return filterBehavior;
    }

    public SortBehavior getSortBehavior() {
        return sortBehavior;
    }

    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }

    public boolean isSorted() {
        return sorted;
    }
}
