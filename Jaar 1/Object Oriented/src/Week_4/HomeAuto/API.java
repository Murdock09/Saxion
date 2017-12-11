package Week_4.HomeAuto;

public class API {
    public static void main(String[] args) {
        //Maak lampen
        Lamp lamp = new Lamp();
        DimLamp dimLamp = new DimLamp();
        HueLamp hueLamp = new HueLamp();

        print("Leeslamp         : " + lamp);
        print("Hanglamp         : " + dimLamp);
        print("Philips HUE lamp : " + hueLamp);
        print("---");

        //Zet lamp aan;
        lamp.switchLamp();
        print("Leeslamp         : " + lamp);

        //Zet dimlamp aan en zet helderheid op 50
        dimLamp.setDim(50);
        dimLamp.switchLamp();
        print("Hanglamp         : " + dimLamp);

        //Zet huelamp aan en stel in op helderheid van 60% en een roodachtige kleur
        hueLamp.setDim(60);
        hueLamp.setColor(255,10,10);
        hueLamp.switchLamp();
        print("Philips HUE lamp : " + hueLamp);
    }

    static void print(Object o){
        System.out.println(o);
    }
}
