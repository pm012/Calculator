package Calculator;

public abstract class State {

    abstract void clear(Calculator calculator);
    abstract void digit(Calculator calculator, char key);
    abstract void arifm(Calculator calculator, char key);
    abstract void equal(Calculator calculator);
    abstract String show(Calculator calculator);

}
