// Task class to represent each task
class Task {
    private String name;
    private String description;
    private String dueDate;
    private boolean completed;

    // Constructor
    public Task(String name, String description, String dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false; // Default status is incomplete
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    // Setter method to mark task as completed
    public void markAsCompleted() {
        this.completed = true;
    }

    // Method to display task details
    public void displayTask() {
        System.out.println("Task Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Status: " + (completed ? "Completed" : "Incomplete"));
    }
}

