package javaclass;


public class Logic{
    //ax2 + bx + c = 0
    //https://www.berdov.com/docs/equation/quadratic_equations/
    private int a;
    private int b;
    private int c;
    private int D;
    private String error;
    private int x1;
    private int x2;

    public Logic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        checkDiscriminant();
        //saveToDB();
    }

    private void checkDiscriminant(){
        //D = b2 − 4ac.
        D = (int)Math.pow(b,2) - 4*a*c;

        if (D <0 ){
            error = "Error";
        };
        if (D == 0){
            x1 = (- b + (int)Math.sqrt(D))/(2*a);
        };
        if (D > 0){
            x1 = (- b + (int)Math.sqrt(D))/(2*a);
            x2 = (- b - (int)Math.sqrt(D))/(2*a);
        };
    }

    public int getD(){
        return D;
    }

    public int getX1(){
        return x1;
    }

    public int getX2(){
        return x2;
    }

    public String getError(){
        return error;
    }

    public void saveToDB(){
        if (D <0){
            AddRequestToDB ar = new AddRequestToDB( Integer.toString(a), Integer.toString(b), Integer.toString(c), Integer.toString(D), error, "-", "-");
            ar.addRequestToDB();
        };
        if (D == 0){
            AddRequestToDB ar = new AddRequestToDB( Integer.toString(a), Integer.toString(b), Integer.toString(c), Integer.toString(D), "-", Integer.toString(x1), "= x1");
            ar.addRequestToDB();
        };
        if (D > 0){
            AddRequestToDB ar = new AddRequestToDB( Integer.toString(a), Integer.toString(b), Integer.toString(c), Integer.toString(D), "-", Integer.toString(x1), Integer.toString(x2));
            ar.addRequestToDB();
        };

    }
}

