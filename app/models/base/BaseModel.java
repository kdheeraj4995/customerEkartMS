package models.base;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by IntelliJ IDEA.
 * User: Dheeraj Reddy
 * Date: 18/06/18
 */

public class BaseModel {

    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private ObjectId id;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
}
