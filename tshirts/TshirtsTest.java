package tshirts;

public class TshirtsTest {

  

  public void sizeCheck() {
    assertTrue(Tshirts.size(37) == "S");
    assertTrue(Tshirts.size(38) == "M");
    assertTrue(Tshirts.size(40) == "M");
    assertTrue(Tshirts.size(43) == "L");
    System.out.println("All is well (maybe!)");
  }
  
}
