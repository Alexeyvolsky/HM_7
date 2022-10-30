public class MilitaryAirTransport extends AirTransport {
    private boolean ejection; //катапультирование
    private int amountRacket; //количество ракет

    public MilitaryAirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int stripLength, boolean ejection, int amountRacket, float getKW) {
        super(power, maxSpeed, weight, model, wingspan, stripLength);
        this.ejection = ejection;
        this.amountRacket = amountRacket;
    }

    public String allInfo(){
        String result = String.valueOf(this.ejection) + this.amountRacket + super.getStripLength() + super.getWingspan() + super.getPower() + super.getMaxSpeed() + super.getWeight() + super.getModel() + super.getKW();
        return result;
    }
    public void showEjection() {
        if(ejection){
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
    public void vistrel(){
        if (amountRacket > 0 ){
            System.out.println("Ракета пошла");
        } else{
            System.out.println("Боеприпасы отсутствуют");
        }
    }
}
