package cars;

public class Tesla extends Car {
    private boolean isDriverInTheCar = false;
    private boolean isGearD = false;
    private boolean isStopPushed = false;


    public void getInTheCar() {
        checkIfTrue(!isWheelsRotating());
        checkIfTrue(!isDriverInTheCar);
        System.out.println("Driver inside");
        isDriverInTheCar = true;
    }

    public void pushButton() {
        checkIfTrue(isDriverInTheCar);
        checkIfTrue(!isGearD);
        if (isEngineStarted()) {
            stopEngine();
        } else {
            startEngine();
        }
    }

    public void pushStop() {
        checkIfTrue(!isStopPushed);
        isStopPushed = true;
        if (isGearD) stopWheelsRotation();
    }

    public void releaseStop() {
        checkIfTrue(isStopPushed);
        isStopPushed = false;
        if (isGearD) startWheelsRotation();
    }

    public void switchToD() {
        checkIfTrue(isStopPushed);
        checkIfTrue(!isGearD);
        isGearD = true;
    }

    public void switchToN() {
        checkIfTrue(isGearD);
        isGearD = false;
    }

    public static void main(String[] args) {
        final var lastochka = new Tesla();
        lastochka.getInTheCar();
        lastochka.pushButton();
        lastochka.pushStop();
        lastochka.switchToD();
        lastochka.releaseStop();
        lastochka.pushStop();
        lastochka.switchToN();
        lastochka.pushButton();
    }

}
