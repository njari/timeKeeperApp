package in.njari.timekeeperapp.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Activity.class,
        parentColumns = "actionId",
        childColumns = "actionId",
        onDelete = ForeignKey.NO_ACTION))
public class Activity {

    @PrimaryKey(autoGenerate = true)
    private long activityId;

    @ColumnInfo(name = "description")
    private String name;

    @ColumnInfo(name = "duration")
    private int duration;

    @ColumnInfo(name = "actionId")
    private long actionId;

    private Activity() {

    }

    public Activity(Action action, int duration) {
        this.actionId = action.getActionId();
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    @Override
    public String toString() {
        return name + " for " + duration + " seconds.";

    }

}
