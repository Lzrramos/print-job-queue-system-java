// Name: Lazaro Ramos
// Date: 4/26/2025

/* This program establishes the queue for the main program. providing methods 
   to manage the jobs by allowing adding removing and listing all jobs.  */

import java.util.ArrayList;

/* This line imports the ArrayList class, allows the main program to store and alter a list. */

public class PrintQueue {

    /* This line begins the execution of this java application. */

    private ArrayList<PrintJob> jobs;

    /* This line is an instance variable, which will store all of the print jobs in the queue. */

    public PrintQueue() {
        jobs = new ArrayList<PrintJob>();
    }

    /* These lines are constructors, this will initialize the variable jobs and start an empty list of jobs. */

    public int getNumberOfPrintJobs() {
        return jobs.size();
    }

    /* These lines when called will return the number of jobs in queue. */

    public boolean addPrintJob(PrintJob job) {
        if (job == null) {
            return false;
        }
        if (findJobPosition(job.getJobID()) != -1) {
            return false;
        }
        jobs.add(job);
        return true;
    }

    /* These lines will add new jobs to the queue, check to verify if the input 
       job is valid. If the job doesnt meet the parameters defined in the PrintJob 
       class or the user has entered a duplicate jobID the job will not be added. 
       If all the paramters are met the job will be added. */

    public int findJobPosition(int jobID) {
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i).getJobID() == jobID) {
                return i;
            }
        }
        return -1;
    }

    /* These lines help the main program find jobs by its jobID. */

    public PrintJob findPrintJobByID(int jobID) {
        int pos = findJobPosition(jobID);
        if (pos != -1) {
            return jobs.get(pos);
        } else {
            return null;
        }
    }

    /* These lines also help the main program find jobs by the jobID. It 
       calls on the above method to assist in finding a specific job.  */

    public PrintJob findPrintJobByIndex(int index) {
        if (index >= 0 && index < jobs.size()) {
            return jobs.get(index);
        } else {
            return null;
        }
    }

    /* These lines help the main program find jobs by its index in the list. */

    public PrintJob removePrintJob(int jobID) {
        int pos = findJobPosition(jobID);
        if (pos != -1) {
            return jobs.remove(pos);
        } else {
            return null;
        }

        /* These lines help the main program remove jobs from the list by using its jobID. */

    }
}