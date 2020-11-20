package com.company;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>
{
    public int compare(Student leftEl, Student rightEl)
    {
        return leftEl.getA() - rightEl.getA();
    }
}