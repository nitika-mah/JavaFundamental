package strings;
public class StringMethods {
  public static void main(String args[]) {
    int x =10, y=20;
    float b = 12.56f;
    char c = 'A';
    String str = "Java Program";

    //println
    System.out.println("Sum is " + x+y);
    System.out.println(x+y + " Sum");
    System.out.println("Sum "+ (x+y));
    System.out.println("Sum of "+ x + " and "+ y + " is " + (x+y));

    //print
    System.out.print("Sum is " + x+y);
    System.out.print(" Sum is " + (x+y));

    //printf
    System.out.printf("\nHello\n");
    System.out.printf("Hello %d %f %c World\n", x, b, c);
    System.out.printf("Hello %o %f %c World\n", x, b, c);
    System.out.printf("Hello %x %f %c World\n", x, b, c);
    //System.out.printf("Hello %f %c World\n", b);  // java.util.MissingFormatArgumentException
    //System.out.printf("Hello %f World\n", x);  //  java.util.IllegalFormatConversionException
    System.out.printf("\nHello %e World\n", b);
    System.out.printf("Hello %g World\n", b);
    System.out.printf("Hello %s World\n", str);

    //Format specifier consists :  %[argument_index$][flags][width][.precision]conversion 
    System.out.printf("%1$d %1$d %1$d\n", x);   // argument index
    System.out.printf("%1$d %1$d %2$d\n", x, y);
    System.out.printf("%1$d %1$d %2$f\n", x, b);
    System.out.printf("%3$s %2$f %1$d\n", x, b, str);

    System.out.printf("\n%d\n", x);
    System.out.printf("%5d\n", x);   // width = 5 
    System.out.printf("%05d\n", x);  // 0 is a flag 
    System.out.printf("%(5d\n", -x); //  (10)
    System.out.printf("%(5d\n", x);  //    10 
    System.out.printf("%(d\n", -x);  // (10)
    System.out.printf("%0(5d\n", -x); //(010)
    System.out.printf("%(05d\n", -x);
    System.out.printf("%+5d\n", x); // +10
    System.out.printf("line %-10d", -x);

    float a = 123.45f;
    float f = 123.43648f;
    System.out.printf("%f\n", a);
    System.out.printf("%6f\n", a);
    System.out.printf("%6.3f\n", a);
    System.out.printf("%6.2f\n", a);
    System.out.printf("%6.2f\n", f);
    System.out.printf("%6.2f\n", 8458436.45f);

    a = 3.45f;
    System.out.printf("%6.2f\n", a);
    System.out.printf("%06.2f\n", a);

    System.out.printf("%s\n", str);
    System.out.printf("%20s\n", str);
    System.out.printf("%-20s", str);
  }
}