class Grades {
    private int[] grades;

    Grades (int n) {
        grades = new int[n];
        for (int i=0; i<n; i++)
            grades[i]=0;
    }

    public void setGrade(int i, int value) {
        grades[i] = value;
    }

    public int getGrade(int i) {
        return grades[i];
    }

    void print(){
        for (int grade: grades){
            System.out.println(grade + " ");
        }
    }
}
