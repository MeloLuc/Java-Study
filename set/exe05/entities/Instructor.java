package set.exe05.entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor implements User {
    
    private Integer code;
    private String name;
    private Set<Course> courses = new HashSet<>();
    
    public Instructor(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    
}
