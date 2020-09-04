package in.njari.timekeeperapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Junction;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity
public class Routine {
    @PrimaryKey(autoGenerate = true)
    private long routineId;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "minutes")
    private int durationMins = 0;
    @ColumnInfo(name = "seconds")
    private int durationSecs = 0;

	@Relation(
			parentColumn = "playlistId",
			entityColumn = "songId",
			associateBy = @Junction(RoutineActivityCrossRef.class)
	)
	public List<Activity> songs;
}






	

