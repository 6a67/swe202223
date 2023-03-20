import packageACC.ACC;

module ACCModule {
    requires SpeedControlSystemModule;

    provides packageSpeedControlSystem.SpeedProvider with ACC;
}