package Calculator;

public class StateY extends State {
    private boolean typing =false;


    public boolean isTyping() {
        return typing;
    }

    public void setTyping(boolean typing) {
        this.typing = typing;
    }


    public void clear(Calculator calculator) {
        calculator.setState(new StateX());
        calculator.getState().clear(calculator);

    }

    public void digit(Calculator calculator, char key) {
        if(!typing){
            calculator.setY(0);
            typing=true;
        }
        calculator.setY(calculator.getY()*10+Character.getNumericValue(key));

    }

    public void arifm(Calculator calculator, char key) { //1+2+ ... 1+2=+
        equal(calculator); // =
        calculator.getState().arifm(calculator, key); //+

    }

    public void equal(Calculator calculator) {
        calculator.setState(new StateAnswer());
        calculator.getState().equal(calculator);

    }

    @Override
    public String show(Calculator calculator){
        return calculator.getY()+"";
    }
}
