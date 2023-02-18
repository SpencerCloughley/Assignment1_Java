package com.example.assignment2;
import java.util.ArrayList;
import javafx.scene.image.Image;

public class Student {
    private String firstName;
    private String lastName;
    private int number;
    private ArrayList<String> activities;
    private String fileName;

    /**
     * @param firstName Students first name
     * @param lastName Students last name
     * @param number Students number assigned by the school
     * @param activities A list of activities the student enjoys
     */
    public Student(String firstName, String lastName, int number, ArrayList<String> activities,String fileName) {
        setFirstName(firstName);
        setLastName(lastName);
        setNumber(number);
        setActivities(activities);
        setFileName(fileName);
    }

    /**
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
        if(firstName.length()>2) {
            firstName = firstName.toLowerCase();
            firstName = firstName.substring(0,1).toUpperCase() +firstName.substring(1);
            firstName = firstName.trim();
            this.firstName = firstName;
        }
        else
            throw new IllegalArgumentException(firstName + " invalid, must be longer than 2 characters");
    }

    /**
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
        if(lastName.length()>2) {
            lastName = lastName.toLowerCase();
            lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
            lastName = lastName.trim();
            this.lastName = lastName;
        }
        else
            throw new IllegalArgumentException(lastName + " invalid, must be longer than 2 characters");
    }

    /**
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
        if(number<9999999 && number>1000000)
            this.number = number;
        else
            throw new IllegalArgumentException(number + "invalid, must be between 1000000 and 9999999");
    }

    /**
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
        if(!activities.isEmpty())
            this.activities = activities;
        else
            throw new IllegalArgumentException("ArrayList was empty, please submit a list with at least 1 activity");
    }

    /**
     * @return returns the String version of the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * sets the name of the image file for the student
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Image getImage(){
        return new Image(Student.class.getResourceAsStream(fileName));
    }
}
