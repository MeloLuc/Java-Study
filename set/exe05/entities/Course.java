package set.exe05.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {

    private String courseName;
    private Set<Student> students = new HashSet<>();
    
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
        result = prime * result + ((students == null) ? 0 : students.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (courseName == null) {
            if (other.courseName != null)
                return false;
        } else if (!courseName.equals(other.courseName))
            return false;
        if (students == null) {
            if (other.students != null)
                return false;
        } else if (!students.equals(other.students))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName + "]";
    }

    
    
}
