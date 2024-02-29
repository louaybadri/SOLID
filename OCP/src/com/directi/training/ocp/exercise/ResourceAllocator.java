package com.directi.training.ocp.exercise;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        int resourceId;
        resourceId = resource.allocate();
        if (resourceId == INVALID_RESOURCE_ID) {
            System.out.println("ERROR: resource allocation failed");
        }
        return resourceId;
    }

    public void free(Resource resource, int resourceId) {

        resource.free(resourceId);
    }

}
