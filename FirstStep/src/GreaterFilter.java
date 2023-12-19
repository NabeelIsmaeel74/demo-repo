import java.util.ArrayList;

public class GreaterFilter implements  FilterBehavior {

    @Override
    public int [] filter(int[] arr  , int n) {

        int sz = arr.length ;
        ArrayList<Integer> temp = new ArrayList<>() ;

        for(int i  = 0 ; i <sz ; i++)
            if (arr[i]  > n )
                temp.add(arr[i]) ;


        int [] ret   = new int[temp.size()] ;

        for (int i = 0 ; i<temp.size() ; i++)
            ret [i] = temp.get(i) ;

        return  ret ;
    }
}
