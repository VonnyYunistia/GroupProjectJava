package class23Project;

public class ReverseString {

  public static String reverseString (String str){
      char ch[]= str.toCharArray();
      String rev="";

      for (int i = ch.length-1; i >=0 ; i--) {

          rev+=ch[i];
      }
      return rev;
  }
}

class ReverseTester extends ReverseString{

    public static void main(String[] args) {

        System.out.println(ReverseString.reverseString("Hello"));
    }
}