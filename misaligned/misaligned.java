package misaligned;

public class Misaligned {

  public static int[] printColorMap() {
    String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
    String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
    int i = 0, j = 0, firstSeparator = 0, lastSeparator = 0, numberOfMisaligned = 0;
    // to iterate all combination of colors
    for (i = 0; i < 5; i++) {
      for (j = 0; j < 5; j++) {
        String eachline = (i * 5 + j) + " | " + majorColors[i] + " | " + minorColors[i];
        System.out.println(eachline);
        // to get the position of separator in first line
        if (i == 0 && j == 0) {
          firstSeparator = eachline.indexOf('|');
          lastSeparator = eachline.lastIndexOf('|');
        }
        // to check whether the next line is aligned with previous line
        boolean isAligned = (firstSeparator == eachline.indexOf('|') && lastSeparator == eachline.lastIndexOf('|'));
        if (!isAligned) {
          numberOfMisaligned++;
        }
      }
    }
    //result array will contain total no of combination printed and how many lines are misaligned
    int[] resultArray = { (i * j), numberOfMisaligned };
    return resultArray;
  }


  public static void main(String[] args) {
    MisalignedTest test=new MisalignedTest();
    test.AlignmentTest();
  }


}
