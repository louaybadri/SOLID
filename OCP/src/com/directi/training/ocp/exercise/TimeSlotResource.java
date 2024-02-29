package com.directi.training.ocp.exercise;

public class TimeSlotResource extends Resource {

    @Override
    void markSlotFree(int resourceId) {
        System.out.println("Time slot " + resourceId + " is free");
    }

    @Override
    int findFreeSlot() {
        System.out.println("Finding free time slot...");
        return 0;
    }

    @Override
    void markSlotBusy(int resourceId) {
        System.out.println("Time slot " + resourceId + " is busy");
    }

}
