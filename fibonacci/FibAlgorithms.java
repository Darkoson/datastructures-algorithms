
class FibAlgorithms {

   public int recursiveDefault(int n) {
      return (n < 2) ? 1 : (recursiveDefault(n - 1) + recursiveDefault(n - 2));
   }
}
