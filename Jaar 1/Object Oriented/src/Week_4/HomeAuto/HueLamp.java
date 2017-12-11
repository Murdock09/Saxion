package Week_4.HomeAuto;

import java.awt.*;

public class HueLamp extends DimLamp {
    private Color color = null;

    public HueLamp() {
        super();
    }

    public void setColor(int red, int green, int blue) {
        this.color = new Color(red, green, blue);
    }

    @Override
    public String toString() {
        if (color == null) {
            return super.toString();
        } else {
            return super.toString() + " en RGB kleur (" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ")";
        }
    }
}
