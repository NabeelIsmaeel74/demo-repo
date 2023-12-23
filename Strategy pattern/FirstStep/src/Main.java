import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random() ;  // to generate random numbers

        ArrayProcessor processes = new ArrayType1() ;


        System.out.println("Doing actions using ArrayType1");
        int [] arr = new  int[10] ;


        for (int i = 0 ; i<10 ; i++) {
            arr[i] = random.nextInt(100) ;
        }

        System.out.println("The initial array");
        processes.display(arr);
        System.out.print("\n");


        processes.sort(arr);

        System.out.println("The array after perform sort action");
        processes.display(arr);
        System.out.print("\n");

        int rand = random.nextInt() ;
        arr = processes.filter(arr  ,  rand) ;
        System.out.println("The array after filtering it using " + rand);
        processes.display(arr);
        System.out.print("\n");

        rand = random.nextInt() ;
        System.out.print("the index of " + rand  + " using search method " + processes.search(arr  , rand) + "\n" );


        System.out.print("---------------------------------------\n");

        processes = new ArrayType2() ;


        System.out.println("Doing actions using ArrayType2");
        arr = new  int[10] ;


        for (int i = 0 ; i<10 ; i++) {
            arr[i] = random.nextInt(100) ;
        }

        System.out.println("The initial array");
        processes.display(arr);
        System.out.print("\n");


        processes.sort(arr);

        System.out.println("The array after perform sort action");
        processes.display(arr);
        System.out.print("\n");

        rand = random.nextInt() ;
        arr = processes.filter(arr  ,  rand) ;
        System.out.println("The array after filtering it using " + rand);
        processes.display(arr);
        System.out.print("\n");

        rand = random.nextInt() ;
        System.out.print("the index of " + rand  + " using search method " + processes.search(arr  , rand) +"\n");


        System.out.print("---------------------------------------\n");



        processes = new ArrayType3() ;


        System.out.println("Doing actions using ArrayType3");
        arr = new  int[10] ;


        for (int i = 0 ; i<10 ; i++) {
            arr[i] = random.nextInt(100) ;
        }

        System.out.println("The initial array");
        processes.display(arr);
        System.out.print("\n");


        processes.sort(arr);

        System.out.println("The array after perform sort action");
        processes.display(arr);
        System.out.print("\n");

        rand = random.nextInt() ;
        arr = processes.filter(arr  ,  rand) ;
        System.out.println("The array after filtering it using " + rand);
        processes.display(arr);
        System.out.print("\n");

        rand = random.nextInt() ;
        System.out.print("the index of " + rand  + " using search method " + processes.search(arr  , rand) +"\n");

    }
}