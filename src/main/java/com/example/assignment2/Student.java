package com.example.assignment2;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int number;
    private ArrayList<String> activities;

    /**
     * @param firstName Students first name
     * @param lastName Students last name
     * @param number Students number assigned by the school
     * @param activities A list of activities the student enjoys
     */
    public Student(String firstName, String lastName, int number, ArrayList<String> activities) {
        setFirstName(firstName);
        setLastName(lastName);
        setNumber(number);
        setActivities(activities);
    }

    /**
     *
     * @return returns the first name of the student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *  set the first name of the student
     *  validates that it is long than 2 characters
     *  sets it to format of "Spencer"
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return return the last name of the student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *  set the last name of the student
     *  validates that it is longer than 2 characters
     *  set it to format of "Cloughley"
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return returns the student number
     */
    public int getNumber() {
        return number;
    }

    /**
     * sets the student number
     * validates that the number assigned is within 1000000-9999999
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @return returns the list of student activities
     */
    public ArrayList<String> getActivities() {
        return activities;
    }

    /**
     *  sets the list of activities for the student
     *  list must have at least 1 string
     * @param activities
     */
    public void setActivities(ArrayList<String> activities) {
        this.activities = activities;
    }
}
