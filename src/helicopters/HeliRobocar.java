package helicopters;

public class HeliRobocar extends Helicopter{
    public void askToFlyUp() {
        checkIfTrue(!isAboveTheGround());
        startFanRotation();
        flyUp();
    }

    public void askToLowDown() {
        checkIfTrue(isAboveTheGround());
        landDown();
        stopFanRotation();
    }

    public static void main(String[] args) {
        final var helic = new HeliRobocar();
        helic.askToFlyUp();
        helic.askToLowDown();
    }
}
