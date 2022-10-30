public class CivilAirTransport extends AirTransport {
    private int numberPassengers;// кол-во пассажиров
    private boolean business;// наличие бизнес класса
    public CivilAirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int stripLength, int numberPassengers, boolean business, float getKW) {
        super(power, maxSpeed, weight, model, wingspan, stripLength);
        this.numberPassengers = numberPassengers;
        this.business = business;
    }
    public void checkNumberPassanger(int number){
        if(number <= numberPassengers){
            System.out.println("Все пассажиры вместились");
        }else {
            System.out.println("Не все пассажиры вместились");
        }
    }
    public String allInfo() {
        String result = this.numberPassengers + String.valueOf(this.business) + super.getWingspan() + super.getStripLength() +  super.getPower() + super.getMaxSpeed() + super.getWeight() + super.getModel() + super.getKW();
        return result;
    }
}
