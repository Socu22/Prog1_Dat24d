package MyTests;

import java.util.ArrayList;
import java.util.Scanner;

public class SaveComplexlyInSoftware {
    static Scanner sc = new Scanner(System.in);
    private final static SaveComplexlyInSoftware instance= new SaveComplexlyInSoftware();

    public static SaveComplexlyInSoftware getInstance() {
        return instance;
    }

    public int getInt() {
        System.out.print("Enter an integer: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            sc.next(); // Discard invalid input
        }
        return sc.nextInt();
    }
    public String getLine() {
        System.out.print("Enter a line of text: ");
        sc.nextLine(); // Clear buffer
        return sc.nextLine();
    }

    public static void main(String[] args) {
        while (true) {
            switch (SaveComplexlyInSoftware.getInstance().getInt()) {
                case 1: //Create Task
                    TaskReciver.getInstance().addToList(TaskController.getInstance().setSectionOfTekstForATask(SaveComplexlyInSoftware.getInstance().getLine()));
                    break;
                case 2: //Remove Task
                    try {
                        System.out.println("remove index: ");
                        TaskReciver.getInstance().removeFromList(SaveComplexlyInSoftware.getInstance().getInt());

                    }catch (IndexOutOfBoundsException e){
                        System.out.println("make something in the list");
                        break;
                    }
                    break;
                case 3: //Show Task
                    int i =0;
                    for (Task t : TaskStorage.getTaskStorageInstance().getTasks()){
                        t.id=i;
                        i++;

                    }
                    Task.taskCounter= TaskStorage.getTaskStorageInstance().getTasks().size();
                    for (int j = 0; j < TaskStorage.getTaskStorageInstance().getTasks().size(); j++) {


                        System.out.println(TaskStorage.getTaskStorageInstance().getTasks().get(j));


                    }
                    break;
            }
        }




    }

}
class TaskController{
    String sectionOfTekst;
    private static final TaskController instance= new TaskController();

    TaskController(){
        this.sectionOfTekst="";
    }

    public String setSectionOfTekstForATask(String sectionOfTekst) {
        this.sectionOfTekst = sectionOfTekst;
        return sectionOfTekst;
    }

    public static TaskController getInstance() {
        return instance;
    }
}
class TaskReciver{
    private static final TaskReciver Instance= new TaskReciver();

    public static TaskReciver getInstance() {
        return Instance;
    }

    public void addToList(String stringInput){
        TaskStorage.getTaskStorageInstance().getTasks().add(new Task(stringInput));
    }
    public void removeFromList(int intInput){
        TaskStorage.getTaskStorageInstance().getTasks().remove(intInput);

    }



}
class Task{
    String sectionOfTekst;
    int id;
    static int taskCounter=0;
    Task(String sectionOfTekst){
        this.sectionOfTekst=sectionOfTekst;
        this.id=taskCounter;
        taskCounter++;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id+"Task{" +
                "sectionOfTekst='" + sectionOfTekst + '\'' +
                '}';
    }
}
class TaskStorage{
    static final TaskStorage taskStorageInstance = new TaskStorage();
    public ArrayList<Task> tasks = new ArrayList<>();


    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public static TaskStorage getTaskStorageInstance() {
        return taskStorageInstance;

    }

}