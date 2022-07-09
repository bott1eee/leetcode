package pattern.facade;

public class SubSystem {

    public void turnOnTV() {
        System.out.println("turn on TV");
    }

    public void setCD(String cd) {
        System.out.println("setCD( " + cd + " )");
    }

    public void startWatching() {
        System.out.println("startWatching");
    }
}
