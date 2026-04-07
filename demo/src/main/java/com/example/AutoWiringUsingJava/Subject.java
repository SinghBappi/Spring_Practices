package com.example.AutoWiringUsingJava;

import java.util.List;

public class Subject {
    private List<String> Subjects;

    public List<String> getSubjects() {
        return Subjects;
    }

    public void setSubjects(List<String> subjects) {
        Subjects = subjects;
    }

    @Override
    public String toString() {
        return Subjects.toString();
    }

    
}
