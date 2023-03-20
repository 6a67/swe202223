module DCCModule {
    requires SpeedControlSystemModule;

    provides packageSpeedControlSystem.SpeedProvider with packageDCC.DCC;
}