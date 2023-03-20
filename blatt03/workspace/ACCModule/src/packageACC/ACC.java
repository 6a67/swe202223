package packageACC;

import packageSpeedControlSystem.SpeedProvider;

public class ACC implements SpeedProvider {

    /**
     * get speed for the vehicle
     *
     * @return speed
     */
    @Override
    public int getFinalSpeed() {
        return 34;
    }

    /**
     * identifier of vehicle
     *
     * @return identifier
     */
    @Override
    public String getDescription() {
        return "ACC";
    }
}
