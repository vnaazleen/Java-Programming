import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/*
Given an array of jobs where every job has a deadline and associated profit (if the job is finished before the deadline). 
It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1. 
How to maximize total profit if only one job can be scheduled at a time.

Input : Five Jobs with following deadlines and profits
   JobID     Deadline     Profit
     a         2           100
     b         1           19
     c         2           27
     d         1           25
     e         3           15
Output : Following is maximum profit sequence of jobs
         c, a, e

*/

public class JobSchedulingProblem {
    public static class Job {
        char id;
        int deadline;
        int profit;

        Job (char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static class Sorter implements Comparator {
        public int compare(Object o1, Object o2) {
            Job j1 = (Job)o1;
            Job j2 = (Job)o2;

            // sort based on profit, if same, based on deadline
            if (j1.profit != j2.profit) 
                return j2.profit - j1.profit;
            return j2.deadline - j1.deadline;
        }
    }

    public static void scheduleJobs(Job jobs[], int n) {
        Sorter sorter = new Sorter();

        Arrays.sort(jobs, sorter);

        TreeSet<Integer> schedular = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            schedular.add(i);
        }

        for (int i = 0; i < n; i++) {
            Integer currentJob = schedular.floor(jobs[i].deadline - 1);

            if (currentJob != null) {
                System.out.print(jobs[i].id + " ");
                schedular.remove(currentJob);
            }
        }
    }

    public static void main(String[] args) 
    { 
        int n = 5; 
        Job[] jobs = new Job[n]; 
  
        jobs[0] = new Job('a', 2, 100); 
        jobs[1] = new Job('b', 1, 19); 
        jobs[2] = new Job('c', 2, 27); 
        jobs[3] = new Job('d', 1, 25); 
        jobs[4] = new Job('e', 3, 15); 
  
        scheduleJobs(jobs, n); 
    } 

}
