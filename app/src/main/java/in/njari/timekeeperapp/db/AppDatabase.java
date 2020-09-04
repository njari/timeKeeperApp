package in.njari.timekeeperapp.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import in.njari.timekeeperapp.model.Action;

@Database(entities = {Action.class}, version = 1, exportSchema = false)
    public abstract class AppDatabase extends RoomDatabase {
        public abstract ActionDAO actionDAO();

}
