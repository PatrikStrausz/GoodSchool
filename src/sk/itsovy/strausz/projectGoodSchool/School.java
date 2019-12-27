package sk.itsovy.strausz.projectGoodSchool;

import java.util.ArrayList;
import java.util.List;

public class School implements SchoolStat {

    private List<Student> list;
    private int count;

    public School(){
        this.list = new ArrayList<Student>() ;

    }
    public void addStudent (Student student){
        list.add(student);
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public Student getTheBestStudent() {
        return null;
    }

    @Override
    public int getAverageAbsence() {
        return 0;
    }

    @Override
    public double getAverageGrade() {
        return 0;
    }

    @Override
    public double getAverageGradeFromMath() {
        return 0;
    }

    @Override
    public Student getWorstStudent() {
        return null;
    }

    @Override
    public int getTheLowestAbsence() {
        return 0;
    }

    @Override
    public List getListSortedByLastNameAsc() {
        return null;
    }

    @Override
    public List getListSortedByAbsenceDesc() {
        return null;
    }
}
