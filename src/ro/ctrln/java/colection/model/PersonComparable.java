package ro.ctrln.java.colection.model;

import java.util.Objects;

public class PersonComparable implements Comparable<PersonComparable> {

    private String firstName;
    private String lastName;
    private Integer age;
    private String job;

    public PersonComparable(String firstName, String lastName, Integer age, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }

    @Override
    public int compareTo(PersonComparable otherPerson) {
        if (this.equals(otherPerson) || this.hashCode() == otherPerson.hashCode()) //
            return 0;
        return this.getAge().compareTo(otherPerson.getAge());
//      return this.getAge() < otherPerson.getAge() ? -1 : this.getAge() > otherPerson.getAge() ? 1 : 0;//Asta cu aia de mai sus fac aceaasi treaba

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonComparable)) return false;
        PersonComparable person = (PersonComparable) o;
        return getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName()) &&
                getAge().equals(person.getAge()) &&
                getJob().equals(person.getJob());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFirstName(), getLastName(), getAge(), getJob());
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }


}
