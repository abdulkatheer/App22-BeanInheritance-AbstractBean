package beans;

public class Marks {
    private int tamil;
    private int english;
    private int cProgramming;
    private int dataStructures;
    private int algorithms;
    private int totalMarks;

    public int getTamil() {
        return tamil;
    }

    public void setTamil(int tamil) {
        this.tamil = tamil;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getcProgramming() {
        return cProgramming;
    }

    public void setcProgramming(int cProgramming) {
        this.cProgramming = cProgramming;
    }

    public int getDataStructures() {
        return dataStructures;
    }

    public void setDataStructures(int dataStructures) {
        this.dataStructures = dataStructures;
    }

    public int getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(int algorithms) {
        this.algorithms = algorithms;
    }

    public int getTotalMarks() {
        totalMarks = this.getTamil() + this.getEnglish() + this.getcProgramming() + this.getDataStructures()
                + this.getAlgorithms();
        return totalMarks;
    }

    public int getPercentage() {
        getTotalMarks();
        return Math.round(totalMarks / 5);
    }
}
