package misaligned;

public class MisalignedTest {

  

  
  public void AlignmentTest() {
    int result = misaligned.printColorMap();
    assert (result == 25);
    misaligned.createReferenceManualMap();
    List<String> colorPair=misaligned.getColorPair(3);
    assert(colorPair.get(0)=="White");
    assert(colorPair.get(0)=="Green");
    System.out.println("All is well");
  }
}
