package cars;

public abstract class Car {
    private boolean isEngineStarted = false;
    private boolean isTurnLightBlinking = false;
    private boolean isWheelsRotating = false;

    protected void startWheelsRotation() {
        System.out.println("Wheel rotation started");
        setWheelsRotating(true);
    }

    protected void stopWheelsRotation() {
        System.out.println("Wheel rotation stopped");
        setWheelsRotating(false);
    }

    protected void startEngine() {
        System.out.println("Engine started");
        setEngineStarted(true);
    }

    protected void stopEngine() {
        System.out.println("Engine stopped");
        setEngineStarted(false);
    }

    protected boolean isEngineStarted() {
        return isEngineStarted;
    }

    private void setEngineStarted(boolean engineStarted) {
        isEngineStarted = engineStarted;
    }

    protected boolean isWheelsRotating() {
        return isWheelsRotating;
    }

    private void setWheelsRotating(boolean wheelsRotating) {
        isWheelsRotating = wheelsRotating;
    }

    public void checkIfTrue(boolean smth) {
        if(!smth) throw new RuntimeException("Wrong usage of TS");
    }
}
