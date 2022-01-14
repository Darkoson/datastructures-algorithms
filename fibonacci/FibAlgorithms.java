import java.util.Map;

class FibAlgorithms {

   /**
    * recursiveDefault 
    * O(2^n) Runtime Complexity, 
    * O(n) Stack complexity
    * @param n
    * @return
    */
   public int recursiveDefault(int n) {
      return (n < 2) ? 1 : (recursiveDefault(n - 1) + recursiveDefault(n - 2));
   }

   /**
    * recursiveMemoized: Memoized Dynamic programming
    * O(n) Runtime Complexity, 
    * O(n) Space complexity, 
    * O(n) Stack complexity
    * 
    * @param n
    * @param memo
    * @return
    */
   public int recursiveMemoized(int n, Map<Integer, Integer> memo) {

      if (memo.size() == 0) {
         memo.put(0, 1);
         memo.put(1, 1);
      }

      if (memo.size() > n) {
         return memo.get(n);
      } else {
         int val = recursiveMemoized(n - 1, memo) + recursiveMemoized(n - 2, memo);
         memo.put(n, val);
         return val;
      }
   }

   /**
    * iterativeDP: Iterative Dynamic Programming
    * 
    * O(n) Runtime complexity,
    * O(n) Space complexity,
    * No recursive stack
    */
   public int iterativeDP(int n) {
      int[] memo = new int[n + 1];

      memo[0] = 1;
      memo[1] = 1;
      if (n >= 2) {
         for (int i = 2; i < memo.length; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
         }
      }

      return memo[n];
   }

   /**
    * advancedIterativeDP: Advanced iterative Dynamic programming
    * O(n) Runtime complexity,
    * O(1) Space complexity,
    * No recursive stack
    * 
    * @param n
    * @return
    */
   public int advancedIterativeDP(int n) {
      int[] memo = { 1, 1 };

      if (n >= 2) {
         for (int i = 2; i <= n; i++) {
            memo[i % 2] = memo[i % 2] + memo[(i - 1) % 2];
         }
      }
      return memo[n % 2];
   }

}
