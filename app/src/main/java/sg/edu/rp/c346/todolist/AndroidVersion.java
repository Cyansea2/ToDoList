package sg.edu.rp.c346.todolist;

public class AndroidVersion {

    private String task;
    private String time;

    public AndroidVersion(String task, String time) {
        this.task = task;
        this.time = time;
    }

    public String getTask() {
        return task;
    }

    public String getTime() {
        return time;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return task + "\n"+ time;
    }
}
