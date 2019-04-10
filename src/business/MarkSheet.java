package business;

import beans.Marks;
import beans.Student;

import java.util.Map;

public class MarkSheet {
    private Map<Student, Marks> m;

    public Map<Student, Marks> getM() {
        return m;
    }

    public void setM(Map<Student, Marks> m) {
        this.m = m;
    }

    public void getMarkSheet(Student student) {
        Marks marks = m.get(student);
        System.out.println("Student Details:");
        System.out.println("------------------------------------------------------------");
        System.out.println(String.format("%-5s: %-25s%-10s: %-20s", "Name", student.getName(), "Reg No",
                student.getRegNo()));
        System.out.println(String.format("%-5s: %-25s%-10s: %-20s", "Dept", student.getDept(), "Sem",
                student.getSem()));
        System.out.println("Marksheet:");
        System.out.println("------------------------------------------------------------");
        System.out.println(String.format("%-20s%-20s%-20s", "Subject", "Total Marks", "Marks Scored"));
        System.out.println(String.format("%-20s%-20s%-20s", "Tamil", "100", String.valueOf(marks.getTamil())));
        System.out.println(String.format("%-20s%-20s%-20s", "English", "100", String.valueOf(marks.getEnglish())));
        System.out.println(String.format("%-20s%-20s%-20s", "C Programming", "100", String.valueOf(marks.getcProgramming())));
        System.out.println(String.format("%-20s%-20s%-20s", "Data Structures", "100", String.valueOf(marks.getDataStructures())));
        System.out.println(String.format("%-20s%-20s%-20s", "Algorithms", "100", String.valueOf(marks.getAlgorithms())));
        System.out.println(String.format("%-20s%-20s%-20s", "Total", "500", marks.getTotalMarks()));
        System.out.println(String.format("%s: %d", "Percentage", marks.getPercentage()));
        System.out.println("----------------------END OF MARKSHEET----------------------\n");

    }
}
