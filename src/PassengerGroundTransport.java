public class PassengerGroundTransport extends GroundTransport {
    private String body;// тип кузова
    private int numberPassengers;//количество пассажиров

    public PassengerGroundTransport(int power, int maxSpeed, int weight, String model, int wheel, int fuelConsumption, String body, int numberPassengers, float getKW) {
        super(power, maxSpeed, weight, model, wheel, fuelConsumption);
        this.body = body;
        this.numberPassengers = numberPassengers;
    }

    public String allInfo() {
        String result = this.body + this.numberPassengers + super.getWheel() + super.getFuelConsumption() + super.getPower() + super.getMaxSpeed() + super.getWeight() + super.getModel() + super.getKW();
        return result;
    }
    public void distance(int time){
        int distance = super.getMaxSpeed() * time;
        int fuel = this.fuel(distance);
        System.out.println("За время " + time +"ч,автомобиль " + super.getModel() + " двигаясь с максимальной скоростью " + super.getMaxSpeed() +" км/ч проедет " + distance + " км и израсходует " + fuel + " литров." );
    }
    private int fuel(int distance){
        int fuel = (distance * super.getFuelConsumption()) / 100;
        return fuel;
    }
}
