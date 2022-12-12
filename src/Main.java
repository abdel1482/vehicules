import java.util.ArrayList;

public class Main {
    private static ArrayList<Vehicle> allVehicule = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello My Vehicules!");

        Vehicle myVehicle = new Vehicle();
        myVehicle.setKmParLittre(20);
        myVehicle.setLitteDeGazoil(10.0);
        myVehicle.setDistance(0);
        allVehicule.add(myVehicle);

        Vehicle yourVehicle = new Vehicle();
        yourVehicle.setKmParLittre(25);
        yourVehicle.setLitteDeGazoil(8.0);
        yourVehicle.setDistance(10000);
        allVehicule.add(yourVehicle);

        Vehicle ourVehicle = new Vehicle();
        ourVehicle.setKmParLittre(15);
        ourVehicle.setLitteDeGazoil(12.0);
        ourVehicle.setDistance(20000);
        allVehicule.add(ourVehicle);

        conduire(100);
        conduire(60);

    }

    private static void conduire(int kmParcourus) {
        for (Vehicle vehicle: allVehicule) {
            System.out.println("distance " + vehicle.getDistance() + " littre de gazoil " + vehicle.getLitteDeGazoil());

            vehicle.go(kmParcourus);

            System.out.println("distance " + vehicle.getDistance() + " littre de gazoil " + vehicle.getLitteDeGazoil());
        }
    }
}