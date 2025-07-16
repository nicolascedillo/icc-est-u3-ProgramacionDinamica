import java.util.HashMap;
import java.util.Map;

public class EjerciciosPD {

    public int getFibonacci(int n){
        if(n <=1){
            return n;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);
    }

    public int getFibonacciPD(int n){
        Map<Integer,Integer> cache = new HashMap<>();
        return getFibonacciPDHelper(n, cache);
    }

    private int getFibonacciPDHelper(int n, Map<Integer,Integer> cache){
        if(n<=1){
            return n;
        }

        if(cache.containsKey(n)){
            return cache.get(n);
        }

        int resultado = getFibonacciPDHelper(n-1, cache) + getFibonacciPDHelper(n-2, cache);
        cache.put(n,resultado);

        return resultado;
    }
}