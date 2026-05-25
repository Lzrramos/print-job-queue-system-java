// Name: Lazaro Ramos
// Date: 4/26/2025

/* This app is used to manage a list of print jobs in a queue, 
   and lets the users add find and remove jobs.*/

import java.util.Scanner;

/* This app uses a scanner. */

public class PrinterApp {

    /* This line begins the execution of this java application.  */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintQueue queue = new PrintQueue();
        int choice;

        /* These lines start the main method of the program, creates the scanner,
           the print queue, and creates the variable for the menu.   */

        do {
            choice = menu(input);
            processChoice(input, choice, queue);
        } while (choice != 99);
    }

    /* These lines set the menu loop, continuing to show the menu until the user wants to exit. */

    public static int menu(Scanner input) {
        System.out.println("\nMenu:");
        System.out.println("1) Add a print job");
        System.out.println("2) Find a print job");
        System.out.println("3) Remove a print job");
        System.out.println("4) List all print jobs");
        System.out.println("99) Quit");
        System.out.print("Please enter your choice: ");
        String line = input.nextLine();
        return Integer.parseInt(line);
    }

    /* These lines set up the menu method, displays all of the options, 
       and reads user inout and converts it into an integer. */

    public static void processChoice(Scanner input, int choice, PrintQueue queue) {
        switch (choice) {
            case 1:
                addPrintJob(input, queue);
                break;
            case 2:
                findPrintJob(input, queue);
                break;
            case 3:
                removePrintJob(input, queue);
                break;
            case 4:
                listAllPrintJobs(queue);
                break;
            case 99:
                System.out.println("Bye");
                break;
            default:
                System.out.println("Error! Invalid choice.");
                break;
        }
    }

    /* These lines tell the program what to do when a specific choice is entered.It also 
       displays an error message if a different number is input.  */

    public static void addPrintJob(Scanner input, PrintQueue queue) {
        System.out.print("Please enter job ID: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.print("Please enter number of pages: ");
        int pages = Integer.parseInt(input.nextLine());
        System.out.print("Please enter name of the owner: ");
        String owner = input.nextLine();

        PrintJob job = new PrintJob(id, pages, owner);
        if (job.isValidPrintJob()) {
            if (queue.addPrintJob(job)) {
                System.out.println("Print job has been added successfully.");
            } else {
                System.out.println("Sorry! Print job was not added. This is a duplicate ID.");
            }
        } else {
            System.out.println("Error! Invalid print job details. Job was not added.");
        }
    }

    /* These lines are helper methods. This tell the program to add a print job into the 
       cue and asks the user to input specific data. If the data that was entered was invalid
       it displays an error message. If the data was correct it displays a message letting the user know. */
    
    public static void findPrintJob(Scanner input, PrintQueue queue) {
        System.out.print("Please enter job ID: ");
        int id = Integer.parseInt(input.nextLine());
        PrintJob job = queue.findPrintJobByID(id);
        if (job != null) {
            displayPrintJob(job);
        } else {
            System.out.println("Sorry, print job not found.");
        }
    }

    /* These lines tell the program to find a print job by the job ID, and prompts the
       user to enter the ID they are looking for. If the ID is valid it prints the data. 
       If the ID is invalid it prints an error message. */

    public static void removePrintJob(Scanner input, PrintQueue queue) {
        System.out.print("Please enter job ID: ");
        int id = Integer.parseInt(input.nextLine());
        PrintJob job = queue.removePrintJob(id);
        if (job != null) {
            System.out.println("Print job has been removed:");
            displayPrintJob(job);
        } else {
            System.out.println("Sorry, print job not found.");
        }
    }

    /* These lines tell the program to remove a job from the queue by jobID. If the job id 
       is valid it notifies the user of success, If not it displays an error message. */

    public static void listAllPrintJobs(PrintQueue queue) {
        for (int i = 0; i < queue.getNumberOfPrintJobs(); i++) {
            PrintJob job = queue.findPrintJobByIndex(i);
            if (job != null) {
                displayPrintJob(job);
                System.out.println("*****************************");
            }
        }
        if (queue.getNumberOfPrintJobs() == 0) {
            System.out.println("No print jobs in the queue.");
        }
    }

    /* These lines tell the program to list all the jobs in queue. if there are jobs 
       in the queue it will display all jobs seperated by a line of asterisks. If there 
       are no jobs it displays a message indicated such. */

    public static void displayPrintJob(PrintJob job) {
        System.out.println("Job ID: " + job.getJobID());
        System.out.println("Number of pages: " + job.getNumberOfPages());
        System.out.println("Owner: " + job.getOwner());
    }

    /* These lines tell the program to display one print job. This determines the 
       layout of the job info. */
}