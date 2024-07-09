package lab10;

public class Main {
    public static void main(String[] args) {
        ToshibaBattery[] toshibaBatteries = new ToshibaBattery[5];
        DuracellBattery[] duracellBatteries = new DuracellBattery[5];

        for (int i = 0; i < 5; i++) {
            toshibaBatteries[i] = new ToshibaBattery(1.5 + i, 0.5 + i, 1000 + i * 100, 200 + i * 50);
        }

        for (int i = 0; i < 5; i++) {
            duracellBatteries[i] = new DuracellBattery(1.5 + i, 0.5 + i, 1000 + i * 100, 0.1 + i * 0.05);
        }

        FlashLight[] flashLights = new FlashLight[5];
        flashLights[0] = new FlashLight(toshibaBatteries);
        flashLights[1] = new FlashLight(duracellBatteries);
        flashLights[2] = new FlashLight(new Battery[]{toshibaBatteries[0], duracellBatteries[0]});
        flashLights[3] = new FlashLight(new Battery[]{toshibaBatteries[1], duracellBatteries[1]});
        flashLights[4] = new FlashLight(new Battery[]{toshibaBatteries[2], duracellBatteries[2]});

        for (FlashLight flashLight : flashLights) {
            System.out.println("Flashlight lifetime: " + flashLight.getTotalLifeTime() + " seconds");
        }

        FlashLight maxLifetimeFlashLight = flashLights[0];
        for (FlashLight flashLight : flashLights) {
            if (flashLight.getTotalLifeTime() > maxLifetimeFlashLight.getTotalLifeTime()) {
                maxLifetimeFlashLight = flashLight;
            }
        }

        System.out.println("Flashlight with maximum lifetime: " + maxLifetimeFlashLight.getTotalLifeTime() + " seconds");
    }
}

