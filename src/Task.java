
import java.time.LocalDate;


public class Task {
    private String title;
    private String description;
    private LocalDate dueDate;
    private String priority;

    // Constructor
    public Task(String title, String description, LocalDate dueDate, String priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;

    }
    // Getters
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public LocalDate getDueDate(){
        return dueDate;
    }
    public String getPriority(){
        return priority;
    }

    // Setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public void setDueDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }

    public void setPriority(String priority){
        this.priority = priority;
    }
    // toString method
    @Override
    public String toString() {
        return "Task{" +
                "Title='" + title + '\'' +
                ", description'" + description + '\'' +
                ", dueDate=" + dueDate +
                ", priority='" + priority + '\'' +
                '}';
    }

    }
















