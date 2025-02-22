package strings;

public class StringMethods {
  public static void main(String args[]) {
    String str = "Java";
    System.out.println("length: "+ str.length());

    System.out.println("to lower case: "+ str.toLowerCase());

    String str1 = "   Welcome   ";
    System.out.println("trim : "+ str1.trim());

    String str2 = str1.trim();
    System.out.println("substring:"+ str2.substring(3));
    System.out.println("substring:"+ str2.substring(3, 6));

    System.out.println("replace : " + str2.replace('e', 'k'));

    String str3 = "wwww.abcd.org";
    System.out.println(str3.startsWith("wwww"));
    System.out.println(str3.startsWith("abc", 5));
    System.out.println(str3.startsWith("https"));
    System.out.println(str3.endsWith(".org"));

    System.out.println(str3.charAt(6));

    System.out.println("index of . : "+ str3.indexOf('.'));
    System.out.println(str3.indexOf(97));
    System.out.println(str3.indexOf("ab"));
    System.out.println(str3.indexOf('.', 5));
    System.out.println(str3.indexOf("?"));
    System.out.println("last index of . : "+ str3.lastIndexOf("."));
    System.out.println("last index of . : "+ str3.lastIndexOf(".",6));
    System.out.println("index of w : "+ str3.indexOf("w"));
    System.out.println("last index of w : "+ str3.lastIndexOf("w"));

    String a = "JAVA", b = "java", c = "python", d = "python";
    System.out.println(c.equals(d));  // true
    System.out.println(a.equals(b));   // false
    System.out.println(a.equalsIgnoreCase(b));  // true

    System.out.println(a.compareTo(b));   // -1
    System.out.println(c.compareTo(b));   // 1
    System.out.println(b.compareTo(c));   // -1
    System.out.println(c.compareTo(d));   // 0
    
    String str4 = "java";
    String str5 = "java";
    String str6 = new String("java");

    System.out.println(".equals : "+ str4.equals(str5));
    System.out.println("== : "+ (str4 == str5));

    System.out.println(".equals : "+ str4.equals(str6));
    System.out.println("== : "+ (str4 == str6));

    System.out.println(String.valueOf(3));
    
    String s = "the great wall of china";
    System.out.println("contains : "+s.contains("t wall"));

  }
}
