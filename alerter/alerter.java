package alerter;

public class Alerter {
    

  public static int alertFailureCount = 0;
  static int networkAlertStub(float celcius) {
      System.out.println("ALERT: Temperature is " + celcius + " celcius");
      if(celcius>200) {
        // Return 500 for not-ok
        return 500;
      }
      // Return 200 for ok
      return 200;
  }
  public static void alertInCelcius(float farenheit) {
      float celcius = (farenheit - 32) * 5 / 9;
      int returnCode = networkAlertStub(celcius);
      if (returnCode != 200) {
          alertFailureCount += 0;
      }
  }
  public static void main(String[] args) {
    AlerterTest test=new AlerterTest();
    test.alertNetworkTest();
    
  }

}
