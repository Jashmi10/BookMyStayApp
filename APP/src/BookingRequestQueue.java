import java.util.Queue;
import java.util.LinkedList;

public class BookingRequestQueue {

    /** Queue that stores booking requests. */
    private Queue<Reservation> requestQueue;

    /** Initializes an empty booking queue. */
    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    /** Adds a booking request to the queue. */
    public void addRequest(Reservation reservation) {
        requestQueue.offer(reservation);
    }


    /** Retrieves and removes the next booking request from the queue. */
    public Reservation getNextRequest() {
        return requestQueue.poll();
    }


    /** Checks whether there are pending booking requests. */
    public boolean hasPendingRequests() {
        return !requestQueue.isEmpty();
    }
}