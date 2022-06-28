package misaligned;

public class misaligned {
    public static int  firstSeparator = 0; 
  public static int  lastSeparator = 0;
  public static int  numberOfMisaligned = 0;
  public static String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };
  public static String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };
  public static Map<Integer,List<String>> colorMap=new HashMap<Integer,List<String>>();
  
  
  public static void getSeparatorPosition(String line) {
    firstSeparator = line.indexOf('|');
    lastSeparator = line.lastIndexOf('|');
  }
  
  
  public static void checkAlignment(String line) {
    boolean isAligned = (firstSeparator == line.indexOf('|') && lastSeparator == line.lastIndexOf('|'));
    if (!isAligned) {
      numberOfMisaligned++;
    }
  }
  
  public static void createReferenceManualMap() {
    int i=0 ,j=0;
    // to iterate all combination of colors
    for ( i = 0; i < 5; i++) {
      for (j = 0; j < 5; j++) {
        List list= new ArrayList<String>();
        list.add(majorColors[i]);
        list.add(minorColors[j]);   
        colorMap.put((i * 5 + j + 1) , list);
      }
      }
  }
  
  public static List<String> getColorPair(int pairNum) {
     List<String> resultList=colorMap.get(pairNum);
     return resultList;
  }
  
  public static int printColorMap() {
    int i=0 ,j=0;
    // to iterate all combination of colors
    for ( i = 0; i < 5; i++) {
      for (j = 0; j < 5; j++) {
        String eachline = (i * 5 + j + 1) + "\t|\t" + majorColors[i] + " \t|\t" + minorColors[j];
        System.out.println(eachline);
        // to get the position of separator in first line
        if (i == 0 && j == 0) {
          getSeparatorPosition(eachline);
        }
        // to check whether the next line is aligned with previous line
        checkAlignment(eachline);
      }
    }

    return (i * j);
  }


  public static void main(String[] args) {
    Misaligned.printColorMap();
    colorManualTest();
  }

  
  
  public static void colorManualTest() {
    int result = Misaligned.printColorMap();
    assert (result == 25);
    Misaligned.createReferenceManualMap();
    List<String> colorPair=Misaligned.getColorPair(3);
    assert(colorPair.get(0)=="White");
    assert(colorPair.get(0)=="Green");
    System.out.println("All is well");
  }
}
