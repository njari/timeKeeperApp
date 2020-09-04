package in.njari.timekeeperapp.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import in.njari.timekeeperapp.model.Action;

@Dao
public interface ActionDAO {
    @Query("SELECT * FROM `action`")
    List<Action> getAll();

    @Insert
    void createAction(Action action);
}
