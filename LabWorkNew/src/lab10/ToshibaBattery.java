package lab10;

public class ToshibaBattery extends Battery{
    private double voltage; // Voltage
    private double currency; // Currency
    private double energy; // Total energy
    private double extraEnergy; // Extra energy

    public ToshibaBattery(double voltage, double currency, double energy, double extraEnergy) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.extraEnergy = extraEnergy;
    }

    @Override
    public double getPower() {
        return voltage * currency;
    }

    @Override
    public double getLifeTime() {
        return (energy + extraEnergy) / getPower();
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getExtraEnergy() {
        return extraEnergy;
    }

    public void setExtraEnergy(double extraEnergy) {
        this.extraEnergy = extraEnergy;
    }
}
