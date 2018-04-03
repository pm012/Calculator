package Calculator;

public class StateX extends State {

    private boolean typing=false;
    public boolean isTyping() {
        return typing;
    }

    public void setTyping(boolean typing) {
        this.typing = typing;
    }


    public void clear(Calculator calculator) {
        calculator.setX(0);
        calculator.setY(0);
        calculator.setOperation('+');

    }

    public void digit(Calculator calculator, char key) {
        if(!typing){
            calculator.setX(0);
            typing=true;
        }
        calculator.setX(calculator.getX()*10+Character.getNumericValue(key));

    }

    public void arifm(Calculator calculator, char key) {
        calculator.setState(new StateAction());
        calculator.getState().arifm(calculator,key);

    }

    public void equal(Calculator calculator) {
        calculator.setState(new StateAnswer());
        calculator.getState().equal(calculator);

    }

    public String show(Calculator calculator){
        return calculator.getX()+"";

    }
}
