public class Vehicle {
    private int kmParLittre = 10;
    private double litteDeGazoil = 25.0;
    private int distance = 0;

    public int getKmParLittre() {
        return kmParLittre;
    }

    public void setKmParLittre(int kmParLittre) {
        this.kmParLittre = kmParLittre;
    }

    public double getLitteDeGazoil() {
        return litteDeGazoil;
    }

    public void setLitteDeGazoil(double litteDeGazoil) {
        this.litteDeGazoil = litteDeGazoil;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void go(int kmParcourus) {
        setLitteDeGazoil( getLitteDeGazoil() - (kmParcourus /getKmParLittre()));
        setDistance(getDistance() + kmParcourus);
    }
}
