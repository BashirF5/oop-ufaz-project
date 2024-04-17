package az.edu.ufaz.Projects.OOPL2S2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Allocation {
    private Destination destination;
    private List<Student> allocatedStudents;
    // Other relevant attributes

    public Allocation(Destination destination, List<Student> allocatedStudents) {
        this.destination = destination;
        this.allocatedStudents = allocatedStudents;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public List<Student> getAllocatedStudents() {
        return allocatedStudents;
    }

    public void setAllocatedStudents(List<Student> allocatedStudents) {
        this.allocatedStudents = allocatedStudents;
    }





//    public void setFitness(int totalSatisfaction) {
//
//    }






    @Override
    public String toString() {
        return "Allocation{" +
                "destination=" + destination +
                ", allocatedStudents=" + allocatedStudents +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Allocation that = (Allocation) o;
//        return Objects.equals(destination, that.destination) && Objects.equals(allocatedStudents, that.allocatedStudents);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, allocatedStudents);
    }



    // Method to add a student to the allocation
    public void addStudent(Student student) {
        allocatedStudents.add(student);
    }

    // Method to remove a student from the allocation
    public void removeStudent(Student student) {
        allocatedStudents.remove(student);
    }

    // Method to check if the allocation has reached its capacity
    public boolean isFull() {
        return allocatedStudents.size() >= destination.getMaxCapacity();
    }

}

