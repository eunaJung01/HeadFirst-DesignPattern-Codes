package Chapter_11.remote_proxy.states;

import java.io.Serializable;

public interface State extends Serializable {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();

}
