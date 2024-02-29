package com.directi.training.ocp.exercise;

public class SpaceSlotResource extends Resource {

    @Override
    void markSlotFree(int resourceId) {
        System.out.println("Space slot " + resourceId + " is free");
    }

    @Override
    int findFreeSlot() {
        System.out.println("Finding free space slot...");
        return 0;
    }

    @Override
    void markSlotBusy(int resourceId) {
        System.out.println("Space slot " + resourceId + " is busy");
    }

}
