package sk.itsovy.strausz.projectGoodSchool;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School implements SchoolStat {

    private List<Student> list;
    private int count;

    public School() {
        this.list = new ArrayList<Student>();

    }

    public void getList() {
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }

    public int getCount() {
        return count;
    }


    public void addStudent(Student student) {
        if (list.contains(student)) {
            System.out.println(student + " is already in list.");
        } else {
            list.add(student);
            count++;
        }
    }

    @Override
    public Student getTheBestStudent() {
        double min = 5;
        for (Student student : list) {
            if (student.getAverageGrade() < min) {
                min = student.getAverageGrade();
            }
        }
        for (Student student : list) {
            if (student.getAverageGrade() == min) {
                return student;
            }
        }
        return null;
    }

    @Override
    public int getAverageAbsence() {
        int sum = 0;
        for (Student student : list) {
            sum += student.getAbsence();
        }
        return sum / list.size();
    }

    @Override
    public double getAverageGrade() {
        double avg = 0;
        for (Student student : list) {
            avg += student.getAverageGrade();
        }
        return avg / list.size();
    }

    @Override
    public double getAverageGradeFromMath() {
        int sum = 0;
        for (Student student : list) {
            sum += student.getG_Mat();
        }
        return (double) sum / list.size();
    }

    @Override
    public Student getWorstStudent() {
        double max = 1;
        for (Student student : list) {
            if (student.getAverageGrade() > max) {
                max = student.getAverageGrade();
            }

        }
        for (Student student : list) {
            if (student.getAverageGrade() == max) {
                return student;
            }
        }
        return null;
    }

    @Override
    public int getTheLowestAbsence() {
        int min = 500;
        for (Student student : list) {
            if (student.getAbsence() < min) {
                min = student.getAbsence();
            }

        }
        return min;
    }

    @Override
    public List getListSortedByLastNameAsc() {
        list.sort(Comparator.comparing(Student::getFirstName));
        list.sort(Comparator.comparing(Student::getLastName));
        return list;
    }

    @Override
    public List getListSortedByAbsenceDesc() {
        list.sort(Comparator.comparing(Student::getAbsence));
        Collections.reverse(list);
        return list;
    }
}
