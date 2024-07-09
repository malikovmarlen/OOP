package lab10;

public class FlashLight {
    private Battery[] batteries;

    public FlashLight() {
        this.batteries = new Battery[0];
    }

    public FlashLight(Battery[] batteries) {
        this.batteries = batteries;
    }

    public double getTotalPower() {
        double totalPower = 0;
        for (Battery battery : batteries) {
            totalPower += battery.getPower();
        }
        return totalPower;
    }

    public double getTotalEnergy() {
        double totalEnergy = 0;
        for (Battery battery : batteries) {
            if (battery instanceof ToshibaBattery) {
                totalEnergy += ((ToshibaBattery) battery).getEnergy() + ((ToshibaBattery) battery).getExtraEnergy();
            } else if (battery instanceof DuracellBattery) {
                totalEnergy += ((DuracellBattery) battery).getEnergy();
            }
        }
        return totalEnergy;
    }

    public double getTotalLifeTime() {
        return getTotalEnergy() / getTotalPower();
    }

    public Battery[] getBatteries() {
        return batteries;
    }

    public void setBatteries(Battery[] batteries) {
        this.batteries = batteries;
    }
}

