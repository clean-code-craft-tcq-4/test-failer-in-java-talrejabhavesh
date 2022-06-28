package tshirts;

public class tshirts {
 public static String size(int cms) {
   
      if(cms>=32 && cms < 38) {
          return "S";
      } else if(cms >= 38 && cms < 42) {
          return "M";
      } else if(cms >= 42 && cms < 48){
          return "L";
      }else {
        return "Entered number is not a valid size";
      }
  }

  public static void main(String[] args) { 
    testSizeCheck();
  }
 
 public static void testSizeCheck() {
    assertTrue(size(37) == "S");
    assertTrue(size(38) == "M");
    assertTrue(size(40) == "M");
    assertTrue(size(43) == "L");
    System.out.println("All is well");
  }
}
