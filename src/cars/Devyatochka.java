package cars;

public class Devyatochka extends Car {
    private boolean isDriverInTheCar = false;
    private boolean isClutchReleased = false;
    private int gear = 0; // 0 = neutral
    private boolean isGasPumping = false;

    public void getInTheCar() {
        checkIfTrue(!isWheelsRotating());
        checkIfTrue(!isDriverInTheCar);
        System.out.println("Driver inside");
        isDriverInTheCar = true;
    }

    public void turnTheKey() {
        checkIfTrue(isDriverInTheCar);
        if (isEngineStarted()) {
            stopEngine();
        } else {
            startEngine();
        }
    }

    public void pushClutchPedal() {
        checkIfTrue(!isClutchReleased);
        isClutchReleased = true;
    }

    public void releaseClutchPedal() {
        checkIfTrue(isClutchReleased);
        isClutchReleased = false;
        if (isEngineStarted()) {
            checkIfTrue((gear == 1 && isGasPumping) || (gear > 1 && isWheelsRotating()) || gear == 0) ;
            if (gear == 1 && !isWheelsRotating()) startWheelsRotation();
        }
    }

    public void shiftGear(int gearNum) {
        checkIfTrue(gearNum < 5 && gearNum >= 0);
        checkIfTrue(isClutchReleased);
        gear = gearNum;
    }

    public void pushGasPedal() {
        isGasPumping = true;
    }

    public void releaseGasPedal() {
        isGasPumping = false;
        if (gear == 1) {
            stopWheelsRotation();
        }
    }

    public static void main(String[] args) {
        final var lastochka = new Devyatochka();
        lastochka.getInTheCar();
        lastochka.turnTheKey();
        lastochka.pushClutchPedal();
        lastochka.shiftGear(1);
        lastochka.pushGasPedal();
        lastochka.releaseClutchPedal();
        lastochka.pushClutchPedal();
        lastochka.shiftGear(2);
        lastochka.releaseClutchPedal();
        lastochka.pushClutchPedal();
        lastochka.shiftGear(1);
        lastochka.releaseClutchPedal();
        lastochka.releaseGasPedal();
        lastochka.pushClutchPedal();
        lastochka.shiftGear(0);
        lastochka.releaseClutchPedal();
        lastochka.turnTheKey();
    }
}
