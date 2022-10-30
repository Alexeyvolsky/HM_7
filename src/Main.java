public class Main {
    public static void main(String[] args) {
        PassengerGroundTransport dist = new PassengerGroundTransport(550, 270, 2000, "Tesla",4,7 , "Sedan", 75,407 );
        dist.distance(18);
        FreightGroundTransport capacity = new FreightGroundTransport(1000,140, 8000, "MAZ",6,9,23000,740 );
        capacity.checkLoadCapacity(6900);
        CivilAirTransport pass = new CivilAirTransport(1200,870,35000,"BOEING", 10,10000,360,true,888);
        pass.checkNumberPassanger(356);
        MilitaryAirTransport rocket = new MilitaryAirTransport(1500,800,67000,"Model",7,3000,true, 18,1110);
        rocket.vistrel();
        rocket.showEjection();
    }
}