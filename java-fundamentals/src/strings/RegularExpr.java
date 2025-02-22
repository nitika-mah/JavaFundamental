package strings;

public class RegularExpr {

  public static void main(String args[]) {
    String str1 = "f";
    System.out.println(str1.matches("."));  // true
    str1 = "abc";
    System.out.println(str1.matches("."));  // false
    
    str1 = "a";
    System.out.println(str1.matches("[abc]")); // true

    str1 = "ab";
    System.out.println(str1.matches("[abc]"));  //false : bcoz this is only for single letter

    str1 = "p";
    System.out.println(str1.matches("[^abc]"));  // true
    System.out.println(str1.matches("[a-z0-9]"));  // true

    str1 = "7";
    System.out.println(str1.matches("[a-z0-9]"));  // true
    str1 = "%";
    System.out.println(str1.matches("[a-z0-9]"));  // false

    str1 ="A";
    System.out.println(str1.matches("[a-z0-9]"));  // false

    str1 = "a";
    System.out.println(str1.matches("[a-z][0-9]"));  // false
    
    str1 = "a5";
    System.out.println(str1.matches("[a-z][0-9]"));

    str1="b";
    System.out.println(str1.matches("a|b")); // a or b // true

    System.out.println(str1.matches("abc"));  // false (it has to be exactly abc)
    str1 = "bca";
    System.out.println(str1.matches("abc"));  // false (it has to be exactly abc)


    str1 = "a";
    System.out.println(str1.matches("\\w"));  // true (\w means either alphabet or number)
    str1 = "5";
    System.out.println(str1.matches("\\w"));  // true (\w means either alphabet or number)

    str1 = "e5";
    System.out.println(str1.matches("\\w"));  // false

    str1 = "$ ";
    System.out.println(str1.matches("\\s"));

  }
  
}
