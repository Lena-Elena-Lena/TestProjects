package mc_style.functions.soap.sap.document.sap_com;

import java.rmi.RemoteException;

import javax.xml.rpc.holders.StringHolder;

public class ZSI_BP_AIRPINProxy implements mc_style.functions.soap.sap.document.sap_com.ZSI_BP_AIRPIN_PortType {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.ZSI_BP_AIRPIN_PortType zSI_BP_AIRPIN_PortType = null;
  
  public ZSI_BP_AIRPINProxy() {
    _initZSI_BP_AIRPINProxy();
  }
  
  public ZSI_BP_AIRPINProxy(String endpoint) {
    _endpoint = endpoint;
    _initZSI_BP_AIRPINProxy();
  }
  
  private void _initZSI_BP_AIRPINProxy() {
    try {
      zSI_BP_AIRPIN_PortType = (new mc_style.functions.soap.sap.document.sap_com.ZSI_BP_AIRPIN_ServiceLocator()).getzsi_bp_airpin();
      if (zSI_BP_AIRPIN_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zSI_BP_AIRPIN_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zSI_BP_AIRPIN_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zSI_BP_AIRPIN_PortType != null)
      ((javax.xml.rpc.Stub)zSI_BP_AIRPIN_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.ZSI_BP_AIRPIN_PortType getZSI_BP_AIRPIN_PortType() {
    if (zSI_BP_AIRPIN_PortType == null)
      _initZSI_BP_AIRPINProxy();
    return zSI_BP_AIRPIN_PortType;
  }

public void zfmShanAirpinSoapServHead(String ivCardNum, String ivTelNum, StringHolder evGuidCadr, StringHolder evRezult)
		throws RemoteException {
	// TODO Auto-generated method stub
	
}
  
  
}