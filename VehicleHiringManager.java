public class VehicleHiringManager {
    TreeLocatorMap x= new TreeLocatorMap();

    public VehicleHiringManager() {
    }

    // Returns the locator map.
    public LocatorMap<String> getLocatorMap() {
        return x;
    }

    // Sets the locator map.
    public void setLocatorMap(LocatorMap<String> locatorMap) {
        LocatorMap<String> a=locatorMap;
    }

    // Inserts the vehicle id at location loc if it does not exist and returns true.
    // If id already exists, the method returns false.
    public boolean addVehicle(String id, Location loc) {
        Pair<Boolean,Integer> a =x.add(id,loc);
        return a.first;
    }

    // Moves the vehicle id to location loc if id exists and returns true. If id not
    // exist, the method returns false.
    public boolean moveVehicle(String id, Location loc) {
        Pair<Boolean,Integer> a=x.move(id,loc);
        return a.first;
    }

    // Removes the vehicle id if it exists and returns true. If id does not exist,
    // the method returns false.
    public boolean removeVehicle(String id) {
        Pair<Boolean,Integer> a=x.remove(id);
        return a.first;
    }

    // Returns the location of vehicle id if it exists, null otherwise.
    public Location getVehicleLoc(String id) {
        Pair<Location,Integer> a =x.getLoc(id);
        return a.first;
    }

    // Returns all vehicles located within a square of side 2*r centered at loc
    // (inclusive of the boundaries).
    public List<String> getVehiclesInRange(Location loc, int r) {
        Location lower= new Location(loc.x-r, loc.y-r);
        Location upper= new Location(loc.x+r, loc.y+r);
        Pair<List, Integer> renge= x.getInRange(lower,upper);
        List<String> a= renge.first;
        return a;
    }
}
