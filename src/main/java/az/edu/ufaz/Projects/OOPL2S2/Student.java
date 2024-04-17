package az.edu.ufaz.Projects.OOPL2S2;

import java.util.*;
public class Student {
    private static String username;
    private String password;
    private int PreferenceScore;
    // Other relevant attributes

    public Student(String username, String password, int PreferenceScore) {
        Student.username = username;
        this.password = password;
        this.PreferenceScore = PreferenceScore;

    }

    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        Student.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPreferenceScore() {
        return PreferenceScore;
    }

    public void setPreferenceScore(int preferenceScore) {
        PreferenceScore = preferenceScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(username, student.username) && Objects.equals(password, student.password);
//    }

    @Override
    public int hashCode() { return Objects.hash(username, password); }

}


