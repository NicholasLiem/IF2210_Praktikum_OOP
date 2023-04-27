import java.util.List;
import java.util.ArrayList;

public class WorkerV2 implements Runnable {

    private List<Task> tasks;

    public WorkerV2(){
        this.tasks = new ArrayList<>();
    };

    public void addTask(Task newTask){
        synchronized (tasks) {
            tasks.add(newTask);
            tasks.notify();
        }
    }

    @Override
    public void run() {
        try {
            while (true && !tasks.isEmpty()) {
                Task executedTask;
                synchronized (tasks) {
                    while (tasks.isEmpty()) {
                        tasks.wait();
                    }
                    executedTask = tasks.remove(0);
                }
                Thread.sleep(executedTask.getTime());
                synchronized (executedTask) {
                    executedTask.setStatus("done");
                    executedTask.notify();
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Worker Error!");
        }
    }
}
