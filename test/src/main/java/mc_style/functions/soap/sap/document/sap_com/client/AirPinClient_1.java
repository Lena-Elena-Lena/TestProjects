package mc_style.functions.soap.sap.document.sap_com.client;

import java.rmi.RemoteException;

import javax.xml.rpc.holders.StringHolder;

import mc_style.functions.soap.sap.document.sap_com.*;

public class AirPinClient {
	
	public java.lang.String getAirPin(String ivCardNum, String ivTelNum) throws javax.xml.rpc.ServiceException {
		String res = null;		
		StringHolder evGuidCadr = null;
		StringHolder evRezult = null;
	
		ZSI_BP_AIRPIN_ServiceLocator servicelocator = new ZSI_BP_AIRPIN_ServiceLocator();
		Zsi_bp_airpinStub stub = (Zsi_bp_airpinStub) servicelocator.getzsi_bp_airpin();
		
		// нужно решить шараду: отправить ivCardNum и ivTelNum. Получить для них evGuidCadr
		try {
			stub.zfmShanAirpinSoapServHead(ivCardNum, ivTelNum, evGuidCadr, evRezult);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
	}

}
