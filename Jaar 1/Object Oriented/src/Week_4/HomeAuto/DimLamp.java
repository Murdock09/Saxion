package Week_4.HomeAuto;

public class DimLamp extends Lamp {
    private int dimLevel;

    public DimLamp() {
        super();
        dimLevel = -1;
    }

    public void setDim(int dimLevel) {
        this.dimLevel = dimLevel;
    }

    @Override
    public String toString() {
        if (dimLevel == -1) {
            return super.toString();
        } else {
            return super.toString() + ", met helderheid " + dimLevel;
        }
    }
}
