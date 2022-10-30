public class FreightGroundTransport extends GroundTransport {
    private int loadCapacity;//грузоподъёмность

    public FreightGroundTransport(int power, int maxSpeed, int weight, String model, int wheel, int fuelConsumption, int loadCapacity, float getKW) {
        super(power, maxSpeed, weight, model, wheel, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }
    public void checkLoadCapacity(int capacity)
    {
        if (capacity <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
    public String allInfo() {
        String result = this.loadCapacity + super.getWheel() + super.getFuelConsumption() + super.getPower() + super.getMaxSpeed() + super.getWeight() + super.getModel() + super.getKW();
        return result;
    }

}
