import java.util.HashMap;
import java.util.Map;

/***
 * CLASS - RoomInventory
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * @version 3.1
 */
public class RoomInventory {

    /**
     * Stores available room count for each room type.
     * Key   -> Room type
     * Value -> Available room count
     */
    private Map<String, Integer> roomAvailability;

    /**
     * Constructor initializes the inventory
     * with default availability values.
     */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /**
     * Initializes room availability data.
     */
    private void initializeInventory() {
        roomAvailability.put("SingleRoom", 10);
        roomAvailability.put("DoubleRoom", 5);
        roomAvailability.put("SuiteRoom", 2);
    }

    /**
     * Returns the current availability map.
     *
     * @return map of room type to available count
     */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * Updates availability for a specific room type.
     *
     * @param roomType the room type to update
     * @param count new availability count
     */
    public void updateAvailability(String roomType, int count) {
        if (roomAvailability.containsKey(roomType)) {
            roomAvailability.put(roomType, count);
        } else {
            System.out.println("Room type not found: " + roomType);
        }
    }
}