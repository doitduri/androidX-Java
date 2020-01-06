package com.example.androidx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText mTodoEditText;
    private TextView mResuiltTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTodoEditText = findViewById(R.id.todo_edit);
        mResuiltTextView = findViewById(R.id.result_text);

        final AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "todo-db")
                .allowMainThreadQueries()
                .build();


        mResuiltTextView.setText(db.todoDao().getAll().toString());

        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.todoDao().insert(new Todo(mTodoEditText.getText().toString()));
                mResuiltTextView.setText(db.todoDao().getAll().toString());
            }
        });

    }
}
