package sk.itsovy.strausz.projectGoodSchool;

public class Main {


    public static void main(String[] args) {
        School school = new School();

        Student s1 = new Student("Karol", "Novak", (byte) 1, (byte) 2, (byte) 1, 24);
        Student s2 = new Student("Viliam", "Benko", (byte) 2, (byte) 2, (byte) 2, 65);
        Student s3 = new Student("Darina", "Vysocka", (byte) 1, (byte) 3, (byte) 1, 35);
        Student s4 = new Student("Miroslav", "Slavik", (byte) 2, (byte) 2, (byte) 1, 5);
        Student s5 = new Student("Daniel", "Matyas", (byte) 1, (byte) 1, (byte) 1, 13);
        Student s6 = new Student("Filip", "Novak", (byte) 2, (byte) 3, (byte) 3, 47);
        Student s7 = new Student("Sebastian", "Mak", (byte) 4, (byte) 3, (byte) 2, 104);
        Student s8 = new Student("Lenka", "Novakova", (byte) 2, (byte) 3, (byte) 1, 30);
        Student s9 = new Student("Peter", "Mrak", (byte) 1, (byte) 1, (byte) 4, 14);
        Student s10 = new Student("Sofia", "Zamboryova", (byte) 3, (byte) 3, (byte) 2, 12);
        Student s11 = new Student("Emil", "Lancak", (byte) 3, (byte) 3, (byte) 4, 25);
        Student s12 = new Student("Filip", "Adamec", (byte) 3, (byte) 2, (byte) 3, 87);
        Student s13 = new Student("Miroslava", "Slavikova", (byte) 3, (byte) 3, (byte) 3, 44);
        Student s14 = new Student("Stanislav", "Ammer", (byte) 4, (byte) 4, (byte) 4, 44);
        Student s15 = new Student("Zuzana", "Stata", (byte) 4, (byte) 2, (byte) 1, 90);

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);
        school.addStudent(s4);
        school.addStudent(s5);
        school.addStudent(s6);
        school.addStudent(s7);
        school.addStudent(s8);
        school.addStudent(s9);
        school.addStudent(s10);
        school.addStudent(s11);
        school.addStudent(s12);
        school.addStudent(s13);
        school.addStudent(s14);
        school.addStudent(s15);

//        school.getList();
        System.out.println("The best student: "+school.getTheBestStudent().getFullName());
        System.out.println("The worst student: "+school.getWorstStudent().getFullName());
        System.out.println("Average absence: "+school.getAverageAbsence());
        System.out.println("Average mark from math: "+school.getAverageGradeFromMath());
        System.out.println("Average grade: "+ school.getAverageGrade());
        System.out.println("The lowest absence: " +school.getTheLowestAbsence());
        System.out.println(school.getListSortedByLastNameAsc());
        System.out.println(school.getListSortedByAbsenceDesc());
    }
}
