package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<AndroidVersion> movieList;
    ArrayAdapter<AndroidVersion> aaList;
    //CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listView) ;

        movieList = new ArrayList<>();
        movieList.add(new AndroidVersion("MSA","1/7/2019"));
        movieList.add(new AndroidVersion("Go for haircut","22/9/2019"));

        aaList = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,movieList);
        //adapter = new CustomAdapter(this, R.layout.row ,movieList);

        lvMovie.setAdapter(aaList);
    }
}
