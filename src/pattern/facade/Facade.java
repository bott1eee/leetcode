package pattern.facade;

public class Facade {

    SubSystem subSystem = new SubSystem();

    public void watchMovie() {
        subSystem.turnOnTV();
        subSystem.setCD("operation in love");
        subSystem.startWatching();
    }

}
