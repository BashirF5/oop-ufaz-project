package az.edu.ufaz.Projects.OOPL2S2;

import java.util.Objects;

public class Destination {
    private String name;
    private int maxCapacity;
    // Other relevant attributes

    public Destination(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", maxCapacity=" + maxCapacity +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Destination that = (Destination) o;
//        return maxCapacity == that.maxCapacity && Objects.equals(name, that.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxCapacity);
    }
}


