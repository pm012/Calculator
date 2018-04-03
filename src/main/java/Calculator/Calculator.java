package Calculator;

public class Calculator {
    private int x;
    private int y;
    private char operation;
    private State state;

    public Calculator(){
        state = new StateX();
        state.clear(this);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void press(char key){
        switch (key){
            case 'c' :
            case 'C' : state.clear(this); break;
            case '0' :
            case '1' :
            case '2' :
            case '3' :
            case '4' :
            case '5' :
            case '6' :
            case '7' :
            case '8' :
            case '9' : state.digit(this, key); break;
            case '+' :
            case '-' :
            case '/' :
            case '*': state.arifm(this, key); break;
            case '=' :state.equal(this); break;
        }

    }

    public int run(String keys){
        for(char key: keys.toCharArray()){
            press(key);
        }
        return x;
    }

    public String show(){
        return state.show(this);

    }
@Override
    public String toString(){
        return "x="+x+" y="+y+" op="+operation+" state="+state.getClass().getSimpleName();
    }
}
