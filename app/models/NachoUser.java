package models;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Class to contain information about a user.
 */
@Entity
public class NachoUser extends play.db.ebean.Model {
    /** The id. */
    @Id
    private long id;

    /** The username. */
    private String userName;
    /** The user type. */
    private long userType;

    /** List of events in which this user has participated. */
    @OneToMany(mappedBy = "nachoUser", cascade = CascadeType.PERSIST)
    private List<EventResult> results;

    public NachoUser(String userName, List<EventResult> results) {
        this.id = id;
        this.userName = userName;
        this.results = results;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserType() {
        return userType;
    }

    public void setUserType(long userType) {
        this.userType = userType;
    }

    public List<EventResult> getResults() {
        return results;
    }

    public void setResults(List<EventResult> results) {
        this.results = results;
    }

    /**
     * The EBean ORM finder method for database queries.
     * @return The finder method.
     */
    public static Finder<Long, NachoUser> find() {
        return new Finder<Long, NachoUser>(Long.class, NachoUser.class);
    }

}
