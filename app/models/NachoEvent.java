package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Class to contain events for nacho nights.
 */
@Entity
public class NachoEvent extends play.db.ebean.Model {
    /** The id. */
    @Id
    private long id;

    /** The event name */
    private String eventName;
    /** The location of the event. */
    private String eventLocation;
    /** Whether the event is complete or not. */
    private boolean complete;

    /** List of event results */
    @OneToMany(mappedBy = "nachoEvent", cascade = CascadeType.PERSIST)
    private List<EventResult> eventResults;

    public NachoEvent(String eventName, String eventLocation, boolean complete, List<EventResult> eventResults) {
        this.id = id;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.complete = complete;
        this.eventResults = eventResults;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public List<EventResult> getEventResults() {
        return eventResults;
    }

    public void setEventResults(List<EventResult> eventResults) {
        this.eventResults = eventResults;
    }

    /**
     * The EBean ORM finder method for database queries.
     * @return The finder method.
     */
    public static Finder<Long, NachoEvent> find() {
        return new Finder<Long, NachoEvent>(Long.class, NachoEvent.class);
    }

}
