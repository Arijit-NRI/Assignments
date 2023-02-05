interface F1 {
    abstract void cube(int a);
    default void square(int a) {
        System.out.println("Default square methodgives result as : "+a*a*a);
    }
    static void sub(int i, int j) {
        System.out.println("Static sub method gives result as : "+ (i-j));
    }
    static void mul(int i, int j) {
        System.out.println("Static mul method gives result as : "+ (i*j));
    }
    static void div(int i, int j) {

        try
        {
            int res=i/j;
            System.out.println("Static div method gives result as : "+ res);
        }
        catch(Exception e)
        {
            System.out.println("Static div method called but division by zero is not possible");
        }
    }
}