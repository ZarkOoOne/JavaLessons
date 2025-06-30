 class Main {
    public static void main(String[] args) {
        Student s = new Student("Fotis","Zarkadas");
        Professor p = new Professor();
        p.gradeStudent(s);
        System.out.println("Teliki Vathmologia: " + s.finalGrade());
    }
}