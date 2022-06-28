package alerter;

public class AlerterTest {

  
  public void alertNetworkTest() {
    alerter.alertInCelcius(400.5f);
    assert(alerter.alertFailureCount==1);
    alerter.alertInCelcius(503.6f);
    assert(Alerter.alertFailureCount==2);
  }
}
