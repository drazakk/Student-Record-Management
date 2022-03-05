import java.util.*;
import java.io.*;

class Main{

    // Function to Add Students, it returns the list of Students
    public static LinkedList<String> add_student(String roll, String name, String age, String gender, String marks){

        // LinkedList Declaration
        LinkedList<String> students_data = new LinkedList<String>();

        // Adding Values to the List
        students_data.add(roll);
        students_data.add(name);
        students_data.add(age);
        students_data.add(gender);
        students_data.add(marks);

        return students_data;
    }

    // Function to Add to the File, it takes List as the parameter and Append the data into the File
    public static void add_to_file(LinkedList<String> data) throws IOException{

        // Created the File object to Read and Write
        File studentRecord = new File("StudentsRecord.txt");
        FileWriter writeToRecord = new FileWriter("StudentsRecord.txt", true);

        // To check if the file exist or not
        // If exist then write to the file (Append the values for the user through List)
        if(studentRecord.exists()){
            for (String e : data){
                writeToRecord.write(e + ",");
            }
            writeToRecord.write("\n");
            writeToRecord.close();
        }
        // If not exist then create the file and call the function again
        else{
            studentRecord.createNewFile();
            add_to_file(data);
        }

    }

    // Function to View all the records of the student
    public static void view_all(){

        try {
            // Created a file object
            File myFile = new File("StudentsRecord.txt");

            // Created a scanner object to read through the file line by line
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {

              // If the file has data in the next line then split the line
              String[] data = myReader.nextLine().split("[,]", 0);

              // Iterate through the line and print the values
              for(String e : data){
                System.out.print(e + "\t");
              }
              System.out.println();
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            e.printStackTrace();
          }

    }

    // Function to search by Roll Number
    public static void search_by_roll(String user_query){

        try {
            File myFile = new File("StudentsRecord.txt");
            Scanner myReader = new Scanner(myFile);

            //Check for the next line
            while (myReader.hasNextLine()) {
              String line = myReader.nextLine();

              // Split the line to work with array
              String[] data = line.split("[,]", 0);
              // Check for the value at index of roll number (0)
              if(data[0].equals(user_query)){
                  for(String e : data){
                      System.out.print(e + "\t");
                  }
                  System.out.println();
              }
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    // Function to search by Name
    public static void search_by_name(String user_query){

        try {
            File myFile = new File("StudentsRecord.txt");
            Scanner myReader = new Scanner(myFile);

            //Check for the next line
            while (myReader.hasNextLine()) {
              String line = myReader.nextLine();

              // Split the line to work with array
              String[] data = line.split("[,]", 0);

              // Check for the value at index of name (1)
              if(data[1].equals(user_query)){
                  for(String e : data){
                      System.out.print(e + "\t");
                  }
                  System.out.println();
              }
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    // Function to search by Age
    public static void search_by_age(String user_query){

        try {
            File myFile = new File("StudentsRecord.txt");
            Scanner myReader = new Scanner(myFile);

            //Check for the next line
            while (myReader.hasNextLine()) {
              String line = myReader.nextLine();

              // Split the line to work with array
              String[] data = line.split("[,]", 0);

              // Check for the value at index of age (2)
              if(data[2].equals(user_query)){
                  for(String e : data){
                      System.out.print(e + "\t");
                  }
                  System.out.println();
              }
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    // Function to search by Gender
    public static void search_by_gender(String user_query){

        try {
            File myFile = new File("StudentsRecord.txt");
            Scanner myReader = new Scanner(myFile);

            //Check for the next line
            while (myReader.hasNextLine()) {
              String line = myReader.nextLine();

              // Split the line to work with array
              String[] data = line.split("[,]", 0);

              // Check for the value at index of gender (3)
              if(data[3].equals(user_query)){
                  for(String e : data){
                      System.out.print(e + "\t");
                  }
                  System.out.println();
              }
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    // Function to search by Marks
    public static void search_by_marks(String user_query){

        try {
            File myFile = new File("StudentsRecord.txt");
            Scanner myReader = new Scanner(myFile);

            //Check for the next line
            while (myReader.hasNextLine()) {
              String line = myReader.nextLine();

              // Split the line to work with array
              String[] data = line.split("[,]", 0);

              // Check for the value at index of marks (4)
              if(data[4].equals(user_query)){
                  for(String e : data){
                      System.out.print(e + "\t");
                  }
                  System.out.println();
              }
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public static void main(String[] args){

        try (Scanner scan = new Scanner(System.in)) {
            while(true){

                // Greeting Message
                System.out.println("\t\tWelcome to Student Record System \n\tPlease select from the following options to proceed!");
                System.out.println("1. Create a new record for the student");
                System.out.println("2. Search for a record of the students");
                System.out.println("3. View all the records");
                System.out.println("4. Rate the Project!");
                System.out.println("5. Close the program!");

                // Asking for the choice from the user
                int user_input = scan.nextInt();

                switch (user_input){
                    case 1: 
                    // Asking User Input
                        System.out.print("Enter the Name of the Student - ");
                        scan.nextLine();
                        String name = scan.nextLine().toUpperCase();
                        System.out.println("\nEnter the Roll Number of the Student - ");
                        String roll = scan.next();
                        System.out.println("\nEnter the Age of the Student - ");
                        String age = scan.next();
                        System.out.println("\nEnter the Gender of the Student (MALE/FEMALE/OTHER) - ");
                        String gender = scan.next().toUpperCase();
                        System.out.println("\nEnter the Marks of the Student - ");
                        String marks = scan.next();
                    // Adding values to the Linked List
                        LinkedList<String> student_data = add_student(roll, name, age, gender, marks);
                    
                    // Adding value to file
                        try {
                            add_to_file(student_data);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    break;
                    
                    case 2:
                        
                        // Asking the User Choice
                        System.out.println("Please select how do you want to Search!");
                        System.out.println("1 - To Search By Roll Number");
                        System.out.println("2 - To Search By Name");
                        System.out.println("3 - To Search By Age");
                        System.out.println("4 - To Search By Gender");
                        System.out.println("5 - To Search By Marks");

                        int choice = scan.nextInt();
                        //Asking the user search value
                        System.out.print("Enter the value you want to search for - ");
                        scan.nextLine();
                        String user_query = scan.nextLine().toUpperCase();

                        System.out.println("Roll No.\tName\tAge\tGender\tMarks");

                        switch(choice){

                            case 1: search_by_roll(user_query);
                            break;
                            case 2: search_by_name(user_query);
                            break;
                            case 3: search_by_age(user_query);
                            break;
                            case 4: search_by_gender(user_query);
                            break;
                            case 5: search_by_marks(user_query);
                            break;
                            default: System.out.println("Error Choice to Available!");

                        }
                    

                    break;

                    case 3: 
                        System.out.println("Roll No.\tName\tAge\tGender\tMarks");
                        view_all();
                    break;

                    case 4:

                        System.out.println("I'm Happy to see you here :)");
                        System.out.println("Please give Rating on the Scale of 1 to 5");
                        int rating = scan.nextInt();
                        
                        switch(rating){
                            case 1:
                                System.out.println("Thanks for Rating\nSorry for the Bad Experience!");
                            break;
                            case 2:
                                System.out.println("Thanks for Rating\nI will improve it!");
                            break;
                            case 3:
                                System.out.println("Thanks for Rating\nI hope you find it useful!");
                            break;
                            case 4:
                                System.out.println("Thanks for Rating\nI hope you enjoyed it!");
                            break;
                            case 5:
                                System.out.println("Thanks for Rating\nYou loved it, Thank you very much!");
                            break;
                        }

                    break;
                    case 5: System.exit(0);
                    break;
                    default: System.out.println("Please choose the correct option!");
                    break;
                }
            }
        }
    }
}