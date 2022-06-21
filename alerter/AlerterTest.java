package alerter;

public class AlerterTest {

  
  public void alertNetworkTest() {
    Alerter.alertInCelcius(400.5f);
    assert(Alerter.alertFailureCount==1);
    Alerter.alertInCelcius(503.6f);
    assert(Alerter.alertFailureCount==2);
  }
}
