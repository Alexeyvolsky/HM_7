public class Transport {
    private int power; //мощность
    private int maxSpeed; //максимальная скорость
    private int weight;//масса
    private String model;//марка
    public float getKW() {
        return (float) (this.power * 0.74);
    }

    public Transport(int power, int maxSpeed, int weight, String model) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model = model;
    }



    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
