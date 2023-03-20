package packageCar;

import packageSpeedControlSystem.SpeedProvider;

import java.util.ServiceLoader;

public class Car {


    /**
     * User inputs either ACC or DCC and get the final speed and description as output
     * @param args
     */
    public static void main(String[] args) {
        // check for valid input
        if(args.length != 1 || (!args[0].equals("ACC") && !args[0].equals("DCC"))) {
            System.err.println("Only ACC or DCC are valid inputs");
            return;
        }

        // get iterator for all available implementations of SpeedProvider
        Iterable<SpeedProvider> instances = ServiceLoader.load(SpeedProvider.class);

        SpeedProvider provider = null;
        // check all providers and check if there is a valid one for the input
        for(SpeedProvider i: instances) {
            switch(args[0]) {
                case "ACC":
                    if(i.getDescription().contains("ACC")) {
                        provider = i;
                    }
                    break;
                case "DCC":
                    if(i.getDescription().contains("DCC")) {
                        provider = i;
                    }
                    break;
            }
        }

        if(provider == null) {
            System.err.println("There is no valid provider for " + args[0]);
            return;
        }

        System.out.println(args[0] + " has a final speed of " + provider.getFinalSpeed() + " and an identifier of " + provider.getDescription());
    }

}
