class Student {
    String name;
    String lastname;
    int hw1;
    int hw2;
    int exam;

    Student(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    Student (String name, String lastname, int hw1, int hw2){
        this(name, lastname);
        this.hw1 = hw1;
        this.hw2 = hw2;
    }

    void gradeAssignment1(int hw1) {
       this.hw1 = hw1;
    }

    void gradeAssignment2(int hw2) {
        this.hw2 = hw2;
    }

    void gradeFinalExam(int exam) {
        this.exam = exam;
    }

    double finalGrade () {
        double m = (hw1 + hw2 + exam)/3.0;
        return m;
    }
}
