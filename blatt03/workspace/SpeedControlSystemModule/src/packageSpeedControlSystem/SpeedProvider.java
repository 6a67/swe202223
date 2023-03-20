package packageSpeedControlSystem;

public interface SpeedProvider {

    /**
     * get speed for the vehicle
     * @return speed
     */
    public int getFinalSpeed();

    /**
     * identifier of vehicle
     * @return identifier
     */
    public String getDescription();

}
