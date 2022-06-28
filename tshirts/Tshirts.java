package tshirts;

public class Tshirts {
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
     TshirtsTest test= new TshirtsTest();
    test.sizeCheck();
  }
}
