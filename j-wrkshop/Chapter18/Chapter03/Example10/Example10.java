class Age10 {
    public double a = 0;

    Age10 ( double _a ) {
        a = _a;
    }

    Age10 ( int year, int month ) {
        a = year + (double) month / 12;
    }

    public double getAge () {
        return a;
    }
}

class Example10 {
    public static void main(String[] args) {
        Age10 age1 = new Age10(12.5);
        Age10 age2 = new Age10(9, 3);
        System.out.println(age1.getAge());
        System.out.println(age2.getAge());
    }
}
