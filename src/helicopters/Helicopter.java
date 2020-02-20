package helicopters;

public abstract class Helicopter {
    private boolean isFanRotating = false;
    private boolean isAboveTheGround = false;

    protected boolean isFanRotating() {
        return isFanRotating;
    }

    protected void startFanRotation(){
        System.out.println("Started Fan Rotation");
        setFanRotating(true);
    }

    protected void stopFanRotation(){
        System.out.println("Stopped Fan Rotation");
        setFanRotating(false);
    }

    protected void flyUp(){
        System.out.println("Being Above the Ground");
        setAboveTheGround(true);
    }

    protected void landDown(){
        System.out.println("Being on solid earth");
        setAboveTheGround(false);
    }

    private void setFanRotating(boolean fanRotating) {
        isFanRotating = fanRotating;
    }

    protected boolean isAboveTheGround() {
        return isAboveTheGround;
    }

    private void setAboveTheGround(boolean aboveTheGround) {
        isAboveTheGround = aboveTheGround;
    }

    public void checkIfTrue(boolean smth) {
        if(!smth) throw new RuntimeException("Wrong usage of TS");
    }
}
