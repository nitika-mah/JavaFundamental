package conditionals;

public class FindWebsiteType {
  public static void main(String[] args) {
    // find type of website and the protocol used
    // http://www.google.com
    String site = "http://www.google.com";
    String protocol = site.substring(0, site.indexOf(":"));
    String ext = site.substring( site.lastIndexOf(".")+1);
    System.out.println("type : "+ ext + " protocol : " + protocol);
    if("http".equals(protocol)) {
      System.out.println("Protocol : Hyper Text Transfer Protocol");
    } else if ("ftp".equals(protocol)) {
      System.out.println("Protocol : File Transfer Protocol");
    }

    if("com".equals(ext)) {
      System.out.println("Commercial");
    } else if("org".equals(ext)){
      System.out.println("Organization");
    }
  }
}
