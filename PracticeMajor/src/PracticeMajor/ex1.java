package PracticeMajor;

public class ex1 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int a[]=new int[5];
      for(int i=0; i<a.length; i++) {
         a[i]=5-i;
      }
      for(int i=0; i<a.length; i++) {
         System.out.println("a["+i+"]="+a[i]);
      }
   }

}