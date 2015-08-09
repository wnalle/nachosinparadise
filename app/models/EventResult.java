package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Holds the results of an event.
 */
@Entity
public class EventResult extends play.db.ebean.Model {
    /** The Id. */
    @Id
    private long id;

    /** The event this result is for. */
    @ManyToOne(cascade = CascadeType.PERSIST)
    private NachoEvent nachoEvent;
    /** The user that submitted this result. */
    @ManyToOne(cascade = CascadeType.PERSIST)
    private NachoUser nachoUser;

    public EventResult(NachoEvent nachoEvent, NachoUser nachoUser) {
        this.nachoEvent = nachoEvent;
        this.nachoUser = nachoUser;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public NachoEvent getNachoEvent() {
        return nachoEvent;
    }

    public void setNachoEvent(NachoEvent nachoEvent) {
        this.nachoEvent = nachoEvent;
    }

    public NachoUser getNachoUser() {
        return nachoUser;
    }

    public void setNachoUser(NachoUser nachoUser) {
        this.nachoUser = nachoUser;
    }

    /**
     * The EBean ORM finder method for database queries.
     * @return The finder method.
     */
    public static Finder<Long, EventResult> find() {
        return new Finder<Long, EventResult>(Long.class, EventResult.class);
    }

}
