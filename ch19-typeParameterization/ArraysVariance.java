public class ArraysVariance {

  public static void main(String[] args) {
    String[] a1 = {"abc"};
    Object[] a2 = a1;
    a2[0] = new Integer(17);  // ArrayStoreExceptionkain
    String s = a1[0];
    System.out.println(s);
   }
}
