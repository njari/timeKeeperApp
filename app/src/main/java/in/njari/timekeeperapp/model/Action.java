package in.njari.timekeeperapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Action {

	public enum ActivityType {
		RESTING, PHYSICAL, MENTAL, OTHER;

	}

	@PrimaryKey(autoGenerate = true )
	private long actionId;
	@ColumnInfo(name = "name")
	private String name;
	@ColumnInfo(name = "activity_type")
	private String activityType;
	@ColumnInfo(name = "description")
	private String description;

	public long getActionId() {
		return this.actionId;
	}
	public String getActivityType() {
		return activityType;
	}
	public String getDescription() {return description;}
	public String getName() {
		return name;
	}

	public void setActivityType(String type) {
		this.activityType = type;
	}
	public void setActionId(long id) {this.actionId = id;}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Action() {
	}
	@Ignore
	public Action(String activityType, String name, String description) {
		this.name = name;
		this.description = description;
		this.activityType = activityType;
	}

}
