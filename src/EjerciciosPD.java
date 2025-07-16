import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {

    public long getFibonacci(int n){
        if(n <=1){
            return n;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);
    }

    public long getFibonacciPD(int n){
        Map<Integer,Long> cache = new HashMap<>();
        return getFibonacciPDHelper(n, cache);
    }

    private long getFibonacciPDHelper(int n, Map<Integer,Long> cache){
        if(n<=1){
            return n;
        }

        if(cache.containsKey(n)){
            return cache.get(n);
        }

        long resultado = getFibonacciPDHelper(n-1, cache) + getFibonacciPDHelper(n-2, cache);
        cache.put(n,resultado);

        return resultado;
    }
}