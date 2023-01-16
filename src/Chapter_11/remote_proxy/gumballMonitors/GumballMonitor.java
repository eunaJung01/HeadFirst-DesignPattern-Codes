package Chapter_11.remote_proxy.gumballMonitors;

import Chapter_11.remote_proxy.gumballMachines.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {

    // 구상 클래스가 아닌, 원격 인터페이스를 사용
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
