// Name: Lazaro Ramos
// Date: 4/26/2025

/* This class takes the data that is input from the main app and creates 
   a print job, and ensures the info is valid and only creating valid print jobs.  */

public class PrintJob {

    /* This line begins the execution of this java application.  */

    private int jobID;
    private int numberOfPages;
    private String owner;
    private boolean isValid;

    /* These lines are the instance variables, and stores the data 
       input from the user. It also has a boolean flag to indicate the validity of the data. */

    public PrintJob(int jobID, int numberOfPages, String owner) {
        if (jobID > 0 && numberOfPages > 0 && owner != null && !owner.isEmpty()) {
            this.jobID = jobID;
            this.numberOfPages = numberOfPages;
            this.owner = owner;
            this.isValid = true;
        } else {
            this.isValid = false;
        }
    }

    /* These lines set the constructor of the printJob class. It validates the input data and assigning each variable.  */

    public int getJobID() {
        return jobID;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isValidPrintJob() {
        return isValid;
    }

    /* These lines are getters. They retrieve the info for each variable. */

}