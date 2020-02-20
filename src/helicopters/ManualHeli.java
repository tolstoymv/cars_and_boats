package helicopters;

public class ManualHeli extends Helicopter{
    public void doALotOfStuffToEnableFan() {
        checkIfTrue(!isFanRotating());
        startFanRotation();
    }

    public void doALotOfStuffToDisableFan() {
        checkIfTrue(!isAboveTheGround());
        checkIfTrue(isFanRotating());
        stopFanRotation();
    }
    public void doALotOfStuffToFlyUp() {
        checkIfTrue(!isAboveTheGround());
        checkIfTrue(isFanRotating());
        flyUp();
    }
    public void doALotOfStuffToFlyDown() {
        checkIfTrue(isAboveTheGround());
        checkIfTrue(isFanRotating());
        landDown();
    }

    public static void main(String[] args) {
        final var helic = new ManualHeli();
        helic.doALotOfStuffToEnableFan();
        helic.doALotOfStuffToFlyUp();
        helic.doALotOfStuffToFlyDown();
        helic.doALotOfStuffToDisableFan();
    }
}
