package in.njari.timekeeperapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import in.njari.timekeeperapp.db.AppDatabase;
import in.njari.timekeeperapp.model.Action;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createNewActivity(View view) {

        Action a = new Action(Action.ActivityType.MENTAL.name() , "Pomodoro", "Define a task. Sit. Get it done.");
        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "timeKeeperAppDB").allowMainThreadQueries().build();
        db.actionDAO().createAction(a);
        List<Action> listOfActions = db.actionDAO().getAll();
        if (listOfActions.isEmpty()) {
            Toast toast = Toast.makeText(this,
                    "Nothing fetched", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Toast toast = Toast.makeText(this,
                    listOfActions.get(0).getName(), Toast.LENGTH_SHORT);
            toast.show();
        }    }

    public void viewActions(View view) {
        Intent intent = new Intent(this, ActionListActivity.class);
        startActivity(intent);
    }
}