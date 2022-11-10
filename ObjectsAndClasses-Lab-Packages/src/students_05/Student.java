package students_05;

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


    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %s years old", this.firstName, this.lastName, this.age);
    }
}

