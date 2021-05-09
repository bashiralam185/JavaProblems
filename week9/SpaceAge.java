public class SpaceAge {
    private static final double EARTH_YEARS_IN_SECONDS = 365.25 * 24 * 60 * 60;
    private double age;

    public SpaceAge(double age) {
        this.age = age;
    }

    public double onEarth(){
        double valriable = (age / EARTH_YEARS_IN_SECONDS) * 100;
        valriable = Math.round(valriable);
        valriable = valriable /100;
        return valriable;
    }

    public double onMercury() {
        double valriable = (onEarth() / 0.2408467) * 100;
        valriable = Math.round(valriable);
        valriable = valriable /100;
        return valriable;
    }

    public double onVenus() {
        double valriable = (onEarth() / 0.61519726) * 100;
        valriable = Math.round(valriable);
        valriable = valriable /100;
        return valriable;
    }

    public double onMars() {
        double valriable = (onEarth() / 1.8808158) * 100;
        valriable = Math.round(valriable);
        valriable = valriable /100;
        return valriable;
    }

    public double onJupiter() {
        double valriable = (onEarth() / 11.862615) * 100;
        valriable = Math.round(valriable);
        valriable = valriable /100;
        return valriable;
    }

    public double onSaturn() {
        double valriable = (onEarth() / 29.447498) * 100;
        valriable = Math.round(valriable);
        valriable = valriable /100;
        return valriable;
    }

    public double onUranus () {
        double valriable = (onEarth() / 84.016846) * 100;
        valriable = Math.round(valriable);
        valriable = valriable /100;
        return valriable;
    }

    public double onNeptune () {
        double valriable = (onEarth() / 164.79132) * 100;
        valriable = Math.round(valriable);
        valriable = valriable /100;
        return valriable;
    }

    @Override
    public String toString() {
        return "SpaceAge{" +
                "ageInSeconds=" + age +
                '}';
    }
}