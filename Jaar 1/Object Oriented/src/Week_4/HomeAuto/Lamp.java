package Week_4.HomeAuto;

public class Lamp {
    private boolean on;

    public Lamp() {
        on = false;
    }

    public void switchLamp() {
        on = !on;
    }

    @Override
    public String toString() {
        if (on) {
            return "aan";
        } else {
            return "uit";
        }
    }
}
