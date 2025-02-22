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

    str1 ="A";
    System.out.println(str1.matches("[a-zA-Z0-9]"));  // true

    str1 = "a";
    System.out.println(str1.matches("[a-z][0-9]"));  // false
    
    str1 = "a5";
    System.out.println(str1.matches("[a-z][0-9]"));

    str1="b";
    System.out.println(str1.matches("a|b")); // a or b // true

    System.out.println(str1.matches("abc"));  // false (it has to be exactly abc)
    str1 = "bca";
    System.out.println(str1.matches("abc"));  // false (it has to be exactly abc)


    // Meta characters
    str1 = "a";
    System.out.println(str1.matches("\\w"));  // true (\w means either alphabet or number)
    str1 = "5";
    System.out.println(str1.matches("\\w"));  // true (\w means either alphabet or number)

    str1 = "e5";
    System.out.println(str1.matches("\\w"));  // false

    str1 = "$ ";
    System.out.println(str1.matches("\\s"));  //false

    // Quantifiers : used for specifying how many symbols we want

    str1 = "abde-+i48347765t834ejkhf*&";
    System.out.println(".* : "+ str1.matches(".*"));

    System.out.println("[abc]* : "+ str1.matches("[abc]*"));  // false
    str1 = "aabccab";
    System.out.println("[abc]* : "+ str1.matches("[abc]*")); // true
    System.out.println("[abc]{3} : "+ "acc".matches("[abc]{3}")); // true
    System.out.println("[abc]{3} : "+ "accb".matches("[abc]{3}")); // false
    System.out.println("[abc]{3,4} : "+ "accb".matches("[abc]{3,4}")); // true

    str1 = "apple";
    System.out.println("[a-z]* : "+ str1.matches("[a-z]*")); // true
    System.out.println("[a-z]* : "+ "ab6cf".matches("[a-z]*")); // false

    System.out.println("[a-z]{5} :" + "apmcb".matches("[a-z]{5}")); // true length 5

    System.out.println("[a-z]? :" + "k".matches("[a-z]?"));// true (0 or 1 time)
    System.out.println("[a-z]? :" + "".matches("[a-z]?"));// true (0 or 1 time)

    str1 = "john@gmail.com";
    System.out.println(str1.matches(".*gmail.*"));
    System.out.println(str1.matches("\\w*@gmail.*"));  //before @ only alphabets and digits are allowed
    str1 = "john-@gmail.com";
    System.out.println(str1.matches("\\w*@gmail.*"));


    // Challenge : find if the email id is on gmail , find username and domain name from email
    String str = "programmer@gmail.com";
    str = "programmer@hotmail.com";

    String username = str.substring(0, str.indexOf('@'));
    System.out.println("username : "+ username);

    String domain = str.substring(str.indexOf('@') + 1, str.indexOf('.'));
    System.out.println(domain.matches("gmail"));

    domain = str.substring(str.indexOf('@') + 1);
    System.out.println("domain : "+ domain);

    System.out.println(domain.substring(0, domain.indexOf(".")).equals("gmail"));


    // Challenge 2 :
   //Find if a number is binary or not
   long b = 101110010110l;
   String s = String.valueOf(b);
   System.out.println("is binary : "+ s.matches("[0-1]+"));

   long c = 10002211110010l;
   System.out.println(String.valueOf(c).matches("[0-1]+"));

   //Find if a number is hexadecimal or not
   String s1 = "234AD";
   System.out.println("hexadecimal : "+ s1.matches("[0-9A-Fa-f]+"));
   
   // Find if the date is in format (dd/mm/yyyy)
   // 01/12/2000
   String s2 = "01/12/2000";
   s2 = "05/10/1998";
   System.out.println(s2.matches("[0-3][1-9]/[0-1][0-9]/\\d{4}"));

   // Challenge 3 : 
   // Remove special characters from a string
   String s3 = "a!b@C#$7%234(^";
   String replacedS3 = s3.replaceAll("\\W", "");
   System.out.println("new s3 : "+ replacedS3);

   //Remove extra spaces from string : 
   s3 = "abc   ghdj   ieweknd   ";
   System.out.println("s3 : "+ s3);
   replacedS3 = s3.replaceAll("\\s+", " ").trim();
   System.out.println("new s3 : "+ replacedS3);

   // Find number of words in a string 
   s3 = "An apple a day keeps doctor away  ";
   String[] words = s3.split("\\s+");  
   System.out.println(words.length);

   s3 = "boo:and:foo";
   words = s3.split("o");     // {"b", "", ":and:f"}
   System.out.println(words.length);


  }
  
}
