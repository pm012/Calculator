package Calculator;

public class StateAnswer extends State {
    public void clear(Calculator calculator) {
        calculator.setState(new StateX());
        calculator.getState().clear(calculator);

    }

    public void digit(Calculator calculator, char key) {
        calculator.setState(new StateX());
        calculator.getState().digit(calculator, key);


    }

    public void arifm(Calculator calculator, char key) {
        calculator.setState(new StateAction());
        calculator.getState().arifm(calculator,key);

    }

    public void equal(Calculator calculator) {
        int answer = 0;
        switch (calculator.getOperation()){
            case '+' : answer = calculator.getX() + calculator.getY(); break;
            case '-' : answer = calculator.getX() - calculator.getY(); break;
            case '*' : answer = calculator.getX() * calculator.getY(); break;
            case '/' : answer = calculator.getX() / calculator.getY(); break;

        }
        calculator.setX(answer);

    }


    @Override
    public String show(Calculator calculator){
        return "= "+calculator.getX();
    }
}
