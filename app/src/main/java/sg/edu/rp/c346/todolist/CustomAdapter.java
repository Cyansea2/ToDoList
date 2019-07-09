package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdapter(Context context, int resource,
                         ArrayList<AndroidVersion> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }
}
