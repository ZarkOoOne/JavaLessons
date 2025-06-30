class varArgs2 {
    int sum(int coeff, int ... varargs) {
        int s = 0;

        for (int elem: varargs)
            s+=elem;

        return s * coeff;
    }
}
