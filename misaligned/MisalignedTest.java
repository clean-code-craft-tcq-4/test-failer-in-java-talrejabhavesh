package misaligned;

public class MisalignedTest {

  
  public void AlignmentTest() {
    int[] result = Misaligned.printColorMap();
    assert (result[0] == 25);
    assert (result[1] == 0);
    System.out.println("All is well (maybe!)");
  }
}
