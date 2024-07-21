import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //I created a list to hold tasks
        List<Task> taskList = new ArrayList<>();

        //My sample tasks
        Task task1 = new Task("Finish JAVA project for GitHub portfolio", "Complete the Java project for GitHub portfolio", LocalDate.of(2024, 7, 25), "High");
        Task task2 = new Task("Apply to Internships", "Be sure to apply to at least 3 for the day", LocalDate.of(2024, 7, 22), "Medium");
        Task task3 = new Task("Read book", "Finish reading 'Computer Organization and Design'", LocalDate.of(2024, 7, 30), "Low");

        //Adding my tasks to the list
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        //Print and display all of my sample tasks
        System.out.println("Tasks:");
        for (Task task : taskList) {
            System.out.println(task);
        }


    }
}