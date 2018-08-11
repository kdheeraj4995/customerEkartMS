package models.base;

import com.dheeraj.utility.helper.DateHelper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by IntelliJ IDEA.
 * User: Dheeraj Reddy
 * Date: 18/06/18
 */

public class BaseModelWithDate {

    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private ObjectId id;

    private String dateCreated;

    private String dateModified;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        if (this.getId() == null) {
            this.dateCreated = DateHelper.getUTCDateTime();
        }
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = DateHelper.getUTCDateTime();
    }
}
