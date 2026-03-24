
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

        // Search Service (Use Case 4)
        RoomSearchService searchService = new RoomSearchService();
        searchService.searchAvailableRooms(inventory, singleRoom, doubleRoom, suiteRoom);

        // Display booking queue header
        System.out.println("\n--- Booking Request Queue ---");

        // Initialize booking queue (Use Case 5)
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Create booking requests (use correct room keys)
        Reservation r1 = new Reservation("Abhi", "SingleRoom");
        Reservation r2 = new Reservation("Subha", "DoubleRoom");
        Reservation r3 = new Reservation("Vanmathi", "SuiteRoom");

        // Add requests to the queue
        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        // Display queued booking requests in FIFO order
        while (bookingQueue.hasPendingRequests()) {
            Reservation next = bookingQueue.getNextRequest();
            System.out.println("Guest: " + next.getGuestName()
                    + " , Requested Room: " + next.getRoomType());
        }
    }

}