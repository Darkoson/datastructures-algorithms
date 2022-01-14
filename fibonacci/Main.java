import java.util.HashMap;

class Main{
    
    public static void main(String[] args) {
        FibAlgorithms fibonacci = new FibAlgorithms() ;

        int n = 7 ;
        
        System.out.println(" recursive default for " +n+" is: "+ fibonacci.recursiveDefault(n));

        HashMap<Integer,Integer> memo =  new HashMap<>();
        System.out.println(" recursive memoized for " +n+" is: "+ fibonacci.recursiveMemoized(n,memo));
        
        System.out.println(" Iterative DP for " +n+" is: "+ fibonacci.iterativeDP(n));
        
        System.out.println(" Advanced Iterative DP for " +n+" is: "+ fibonacci.advancedIterativeDP(n));
    }
}