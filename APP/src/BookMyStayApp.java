
/**

        * =
        * MAIN CLASS - UseCase1HotelBookingApp

* Use Case 1: Application Entry & Welcome Message

* Description:
        * This class represents the entry point of the
* Hotel Booking Management System.

        * At this stage, the application:
        * - Starts execution from the main() method
* - Displays a welcome message to the user
* - Confirms that the system has started successfully

* No business logic, data structures, or user input
* is implemented in this use case.

        * The goal is to establish a clear and predictable
* application startup point.

* @author Developer
* @version 1.0
        */
public class BookMyStayApp {

    /**
     * Application entry point.
     * <p>
     * This method is the first method executed
     * when the program is launched by the JVM.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.println("System initialized Successfully\n");

        // Room objects (Use Case 2)
        SuiteRoom suiteRoom = new SuiteRoom();
        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();

        // Inventory (Use Case 3)
        RoomInventory inventory = new RoomInventory();

        // NEW: Search Service (Use Case 4)
        RoomSearchService searchService = new RoomSearchService();

        // Perform search (read-only operation)
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }

}