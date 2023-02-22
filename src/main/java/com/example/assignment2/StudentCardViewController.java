package com.example.assignment2;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class StudentCardViewController implements Initializable {

    @FXML
    private ListView<String> activityList;

    @FXML
    private Label nameLabel;

    @FXML
    private Label numberLabel;

    @FXML
    private Button btnNextStudent;

    @FXML
    private ImageView imageView;

    //keeps track of currently viewed student
    private int current;
    //an array of all students to cycle through
    private Student[] students;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        ArrayList<String> spencer=new ArrayList<String>();
        spencer.add("Video Games");
        Student s1 = new Student("Spencer","Cloughley",1178551,spencer,"images/spencer.png");
        s1.addActivity("Rock Climbing");
        s1.addActivity("Cross Stitch");
        s1.addActivity("Going to Concerts");

        ArrayList<String> adrian=new ArrayList<String>();
        adrian.add("Flying Planes");
        //names inputted in incorrect format to show adjustment to correct format
        Student s2= new Student("adrian","BISNATH",1687987,adrian,"images/adrian.png");
        s2.addActivity("Video Games");
        s2.addActivity("Piano");

        ArrayList<String> scott=new ArrayList<String>();
        scott.add("Going to Concerts");
        //names inputted in incorrect format to show adjustment to correct format
        Student s3 = new Student("ScoTT","denBy",3467459,scott,"images/scott.png");
        s3.addActivity("Theatre");
        s3.addActivity("Crochet");

        students = new Student[]{s1, s2, s3};

        current=0;
        updateLabels(s1);
    }

    /**
     * Changes label and pictures to display the next student and tracks which student is currently on display
     * @param event
     */
    @FXML
    void nextStudent(ActionEvent event){
        if(current==0 || current==1){
            updateLabels(students[current+1]);
            current++;
        }
        else {
            updateLabels(students[0]);
            current=0;
        }
    }

    /**
     * Updates labels and pictures to student in parameters
     * @param student
     */
    private void updateLabels(Student student){
        numberLabel.setText(Integer.toString(student.getNumber()));
        nameLabel.setText(student.getFirstName() + " " +student.getLastName());
        activityList.setItems(FXCollections.observableArrayList(student.getActivities()));
        imageView.setImage(student.getImage());
    }
}
