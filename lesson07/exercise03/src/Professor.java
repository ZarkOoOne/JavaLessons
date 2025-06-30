import java.util.Random;

class Professor {

    void gradeStudent (Student s){
        Random r = new Random();
        s.gradeAssignment1(r.nextInt(11));
        s.gradeAssignment2(r.nextInt(11));
        s.gradeFinalExam(r.nextInt(11));
        s.finalGrade();
    }
}
