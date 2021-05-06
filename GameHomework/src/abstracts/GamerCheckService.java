package abstracts;

import java.rmi.RemoteException;

import entities.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer)throws NumberFormatException, RemoteException;
}
