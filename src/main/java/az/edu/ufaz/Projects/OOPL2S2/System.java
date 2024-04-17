package az.edu.ufaz.Projects.OOPL2S2;

import java. util. Scanner;
import java.util.List;
import java.util.Objects;

public class System {
    // Define the System class
    private List<Student> students;
    private List<Destination> destinations;
    // Other relevant attributes

    public System(List<Student> students, List<Destination> destinations) {
        this.students = students;
        this.destinations = destinations;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
    }

    @Override
    public String toString() {
        return "System{" +
                "students=" + students +
                ", destinations=" + destinations +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        System system = (System) o;
//        return Objects.equals(students, system.students) && Objects.equals(destinations, system.destinations);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(students, destinations);
    }









    // Methods for handling input, presenting output, data processing, etc.
    // Method for handling input
    public void handleInput() {
        // Example: Read input from the user and populate the lists of students and destinations
        Scanner scanner = new Scanner(java.lang.System.in);

        // Read student data
        java.lang.System.out.println("Enter number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        for (int i = 0; i < numStudents; i++) {
            java.lang.System.out.println("Enter student name:");
            String name = scanner.nextLine();
            scanner.nextLine(); // Consume newline character
            java.lang.System.out.println("Enter student's password");
            String password = scanner.nextLine();
            scanner.nextLine(); // Consume newline character
            java.lang.System.out.println("Enter student's destination preference score");
            int preferenceScore = scanner.nextInt();
            // Create a new Student object and add it to the students list
            students.add(new Student(name, password, preferenceScore));
        }

        // Read destination data
        java.lang.System.out.println("Enter number of destinations:");
        int numDestinations = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        for (int i = 0; i < numDestinations; i++) {
            java.lang.System.out.println("Enter destination name:");
            String name = scanner.nextLine();
            java.lang.System.out.println("Enter maximum capacity:");
            int maxCapacity = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            // Create a new Destination object and add it to the destinations list
            destinations.add(new Destination(name, maxCapacity));
        }
    }

    // Method for presenting output
    public void presentOutput() {
        // Example: Print out the lists of students and destinations
        java.lang.System.out.println("Students:");
        for (Student student : students) {
            java.lang.System.out.println(Student.getUsername());
        }

        java.lang.System.out.println("Destinations:");
        for (Destination destination : destinations) {
            java.lang.System.out.println(destination.getName() + " (Max Capacity: " + destination.getMaxCapacity() + ")");
        }
    }

    // Method for data processing
    public void processData() {
        // Example: Process data as needed
        // This could involve sorting students or destinations based on certain criteria,
        // calculating statistics, or performing any other necessary data manipulation
        // For simplicity, let's just print out the number of students and destinations
        java.lang.System.out.println("Number of students: " + students.size());
        java.lang.System.out.println("Number of destinations: " + destinations.size());
    }

}
