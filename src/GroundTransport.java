public class GroundTransport extends Transport {
    private int wheel; //количество колес
    private int fuelConsumption; //расход топлива

    public GroundTransport(int power, int maxSpeed, int weight, String model, int wheel, int fuelConsumption) {
        super(power, maxSpeed, weight, model);
        this.wheel = wheel;
        this.fuelConsumption = fuelConsumption;
    }
    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
