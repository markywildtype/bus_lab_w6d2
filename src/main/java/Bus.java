import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addPassenger(Person person) {
        if (this.passengers.size() < this.capacity)
        this.passengers.add(person);
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }

    public void pickUp(BusStop busstop) {
        Person person = busstop.removePerson();
        addPassenger(person);
    }
}
