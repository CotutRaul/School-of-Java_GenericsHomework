import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static <E> void changePozition(E[] array, int a, int b)
    {
        E aux = array[a];
        array[a]=array[b];
        array[b]=aux;
    }
    static int checkPrime(int n)
    {
        if (n<2)
            return 0;
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    static <E> int numberOfPrimes(List<E> list)
    {
        int nr=0;
        for (E l : list) {
            try{
                int i = Integer.parseInt(l.toString());
                nr+=checkPrime(i);

            }
            catch (Exception e){}

        }
        return nr;
    }

    public static void main(String[] args) {
        String [] strings = {"1","Ana","3","Cotut","10","13","17","Ioan"};
        Integer[] ints = {1,2,4,6,10,9,85,77,11};
        Double[] doubles = {1.2,5.0,12.5,17.0,16.0,17.5,13.0,2.0};
        Long[] longs = {1L,5L,12L,17L,16L,17L,13L,2L, 131L, 117L, 125L};
        changePozition(strings,2,5);
        changePozition(ints,1,4);
        changePozition(doubles,1,4);
        System.out.println("After change");
        System.out.println("Strings:");
        for (String s : strings) {
            System.out.print(s + " ");
        }
        System.out.println("\nIntegers:");
        for (Integer i : ints) {
            System.out.print(i + " ");
        }
        System.out.println("\nDoubles:");
        for (Double d : doubles) {
            System.out.print(d + " ");
        }
        System.out.println("\n\nPrimes in Strings: " + numberOfPrimes(Arrays.stream(strings).collect(Collectors.toList())));
        System.out.println("\nPrimes in Integers: " + numberOfPrimes(Arrays.stream(ints).collect(Collectors.toList())));
        System.out.println("\nPrimes in Longs: " + numberOfPrimes(Arrays.stream(longs).collect(Collectors.toList())));

    }
}
