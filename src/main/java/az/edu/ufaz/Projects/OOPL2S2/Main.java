package az.edu.ufaz.Projects.OOPL2S2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create and initialize lists of students and destinations
        List<Student> students = new ArrayList<>();
        List<Destination> destinations = new ArrayList<>();
        List<Allocation> population = new ArrayList<>();
        // Add students and destinations to the lists

        // Create an instance of the Optimization class
        Optimization optimization = new Optimization(students, destinations, population, 100); // Example population size

        // Run the optimization process
        optimization.run();
    }
}
