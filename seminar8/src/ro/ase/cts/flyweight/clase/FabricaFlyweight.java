package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
	
	private Map<String,FlyweightAbstract> clienti;
	
	public FabricaFlyweight() {
		clienti=new HashMap<>();
	}
	
	//cheia e nr de tel
	public FlyweightAbstract getClient(String nrTel) {
		Client client=(Client)clienti.get(nrTel);
		if(client==null) {
			client=new Client("Popescu", nrTel,"popescu@gmail.com");
			clienti.put(nrTel,client);
		}
		
		return client;
		
	}
}
