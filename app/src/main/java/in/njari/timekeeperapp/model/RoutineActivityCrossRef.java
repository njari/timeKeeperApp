package in.njari.timekeeperapp.model;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Relation;

import java.util.List;

@Entity(primaryKeys = {"playlistId", "songId"})
public class RoutineActivityCrossRef {

    @Embedded
    public Routine company;

    @Relation(parentColumn = "id", entityColumn = "companyId", entity = Activity.class)
    public List<Activity> activities;
}
