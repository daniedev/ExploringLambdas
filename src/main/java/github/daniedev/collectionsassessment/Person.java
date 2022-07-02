package github.daniedev.collectionsassessment;

public class Person {

    private String firstName;
    private String LastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}
