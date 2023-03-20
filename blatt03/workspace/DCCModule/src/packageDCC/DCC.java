package packageDCC;

import packageSpeedControlSystem.SpeedProvider;

public class DCC implements SpeedProvider {
    /**
     * get speed for the vehicle
     *
     * @return speed
     */
    @Override
    public int getFinalSpeed() {
        return 11;
    }

    /**
     * identifier of vehicle
     *
     * @return identifier
     */
    @Override
    public String getDescription() {
        return "DCC";
    }
}
