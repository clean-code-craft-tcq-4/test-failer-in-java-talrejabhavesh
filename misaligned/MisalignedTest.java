package misaligned;

public class MisalignedTest {

  

  
  public void AlignmentTest() {
    int result = Misaligned.printColorMap();
    assert (result == 25);
    Misaligned.createReferenceManualMap();
    List<String> colorPair=Misaligned.getColorPair(3);
    assert(colorPair.get(0)=="White");
    assert(colorPair.get(0)=="Green");
    System.out.println("All is well");
  }
}
