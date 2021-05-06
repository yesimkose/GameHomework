package adapters;

import java.rmi.RemoteException;

import abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=client.TCKimlikNoDogrula(
				
				Long.parseLong(gamer.getNationalityId()), 
				gamer.getFirstName().toUpperCase(), 
				gamer.getLastName().toUpperCase(), 
				gamer.getDateOfYear()
				
				);
		
		
		return result;
		
	}
	
}
