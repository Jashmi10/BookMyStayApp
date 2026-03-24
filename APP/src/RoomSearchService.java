import java.util.Map;

/**
 *
 * CLASS - RoomSearchService
 *
 * Use Case 4: Room Search & Availability Check
 *
 * @version 4.0
 */
public class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("\n--- Available Rooms ---");

        // Check and display Single Room availability
        if (availability.getOrDefault("SingleRoom", 0) > 0) {
            System.out.println("\nSingle Room Available:");
            singleRoom.displayRoomDetails();
            System.out.println("Available Count: " + availability.get("SingleRoom"));
        }

        // Check and display Double Room availability
        if (availability.getOrDefault("DoubleRoom", 0) > 0) {
            System.out.println("\nDouble Room Available:");
            doubleRoom.displayRoomDetails();
            System.out.println("Available Count: " + availability.get("DoubleRoom"));
        }

        // Check and display Suite Room availability
        if (availability.getOrDefault("SuiteRoom", 0) > 0) {
            System.out.println("\nSuite Room Available:");
            suiteRoom.displayRoomDetails();
            System.out.println("Available Count: " + availability.get("SuiteRoom"));
        }

        // Optional: If no rooms available
        if (availability.getOrDefault("SingleRoom", 0) == 0 &&
                availability.getOrDefault("DoubleRoom", 0) == 0 &&
                availability.getOrDefault("SuiteRoom", 0) == 0) {

            System.out.println("\nNo rooms available at the moment.");
        }
    }
}