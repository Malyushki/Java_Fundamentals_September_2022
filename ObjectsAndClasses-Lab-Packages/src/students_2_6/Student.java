package students_2_6;

import java.util.List;

public class Student {
    String firstName;
    String lastName;
    String age;
    String city;

    public Student(String firstName, String lastName, String age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public void updateData( String age, String city) {
        this.age = age;
        this.city = city;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static Student getStudent(List<Student> studentList, String firstName, String lastName){
      Student  existingStudent = null;
        for (Student student:studentList) {
            if (student.getFirstName().equals(firstName)&&student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }
        return existingStudent;
    }


    @Override
    public String toString() {
        return String.format("%s %s is %s years old", this.firstName, this.lastName, this.age);
    }
}

