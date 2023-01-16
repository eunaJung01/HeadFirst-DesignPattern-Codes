package Chapter_11.remote_proxy.gumballMachines;

import Chapter_11.remote_proxy.states.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {

    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;

}
