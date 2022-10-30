public class AirTransport extends Transport {
    private int wingspan;// размах крыльев
    private int stripLength;// мин длина полосы для взлета
    public AirTransport(int power, int maxSpeed, int weight, String model, int wingspan, int stripLength) {
        super(power, maxSpeed, weight, model);
        this.wingspan = wingspan;
        this.stripLength = stripLength;
    }
    public int getWingspan() { return wingspan; }

    public void setWingspan(int wingspan) {this.wingspan = wingspan;}

    public int getStripLength() { return stripLength; }

    public void setStripLength(int stripLength) { this.stripLength = stripLength; }
}
