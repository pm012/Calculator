package Calculator;

public class StateAction extends State {
    public void clear(Calculator calculator) {
        calculator.setState(new StateX());
        calculator.getState().clear(calculator);

    }

    public void digit(Calculator calculator, char key) {
        calculator.setState(new StateY());
        //calculator.setY(calculator.getY()*10+Character.getNumericValue(key));
        calculator.getState().digit(calculator, key);

    }

    public void arifm(Calculator calculator, char key) {
        calculator.setOperation(key);

    }

    public void equal(Calculator calculator) {
        calculator.setY(calculator.getX());
        calculator.setState(new StateAnswer());
        calculator.getState().equal(calculator);

    }

    @Override
    public String show(Calculator calculator){
        return calculator.getX()+" "+calculator.getOperation();
    }
}
