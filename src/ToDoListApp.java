import java.util.ArrayList;
import java.util.Scanner;
// Main class to manage tasks
public class ToDoListApp {
    private ArrayList<Task> taskList;
    private Scanner scanner;

    // Constructor
    public ToDoListApp() {
        taskList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Method to add a new task
    public void addTask() {
        System.out.println("Enter task name:");
        String name = scanner.nextLine();
        System.out.println("Enter task description:");
        String description = scanner.nextLine();
        System.out.println("Enter due date:");
        String dueDate = scanner.nextLine();

        Task newTask = new Task(name, description, dueDate);
        taskList.add(newTask);

        System.out.println("Task added successfully!");
    }

    // Method to display all tasks
    public void displayTasks() {
        if (taskList.isEmpty()) {
            System.out.println("Task list is empty.");
        } else {
            for (Task task : taskList) {
                task.displayTask();
                System.out.println("--------------------");
            }
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        ToDoListApp toDoListApp = new ToDoListApp();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== To-Do List Application =====");
            System.out.println("1. Add a new task");
            System.out.println("2. Display all tasks");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    toDoListApp.addTask();
                    break;
                case 2:
                    toDoListApp.displayTasks();
                    break;
                case 3:
                    System.out.println("Exiting application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }
}
