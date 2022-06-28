package tshirts;

public class TshirtsTest {

  

  public void sizeCheck() {
    assertTrue(tshirts.size(37) == "S");
    assertTrue(tshirts.size(38) == "M");
    assertTrue(tshirts.size(40) == "M");
    assertTrue(tshirts.size(43) == "L");
    System.out.println("All is well (maybe!)");
  }
  
}
