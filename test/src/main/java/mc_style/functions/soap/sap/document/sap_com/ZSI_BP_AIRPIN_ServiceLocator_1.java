/**
 * ZSI_BP_AIRPIN_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZSI_BP_AIRPIN_ServiceLocator extends org.apache.axis.client.Service implements mc_style.functions.soap.sap.document.sap_com.ZSI_BP_AIRPIN_Service {

    public ZSI_BP_AIRPIN_ServiceLocator() {
    }


    public ZSI_BP_AIRPIN_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ZSI_BP_AIRPIN_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for zsi_bp_airpin
    private java.lang.String zsi_bp_airpin_address = "http://c7r.lan.ubrr.ru:8000/sap/bc/srt/rfc/sap/zsi_bp_airpin/300/zsi_bp_airpin/zsi_bp_airpin";

    public java.lang.String getzsi_bp_airpinAddress() {
        return zsi_bp_airpin_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String zsi_bp_airpinWSDDServiceName = "zsi_bp_airpin";

    public java.lang.String getzsi_bp_airpinWSDDServiceName() {
        return zsi_bp_airpinWSDDServiceName;
    }

    public void setzsi_bp_airpinWSDDServiceName(java.lang.String name) {
        zsi_bp_airpinWSDDServiceName = name;
    }

    public mc_style.functions.soap.sap.document.sap_com.ZSI_BP_AIRPIN_PortType getzsi_bp_airpin() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(zsi_bp_airpin_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getzsi_bp_airpin(endpoint);
    }

    public mc_style.functions.soap.sap.document.sap_com.ZSI_BP_AIRPIN_PortType getzsi_bp_airpin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mc_style.functions.soap.sap.document.sap_com.Zsi_bp_airpinStub _stub = new mc_style.functions.soap.sap.document.sap_com.Zsi_bp_airpinStub(portAddress, this);
            _stub.setPortName(getzsi_bp_airpinWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setzsi_bp_airpinEndpointAddress(java.lang.String address) {
        zsi_bp_airpin_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mc_style.functions.soap.sap.document.sap_com.ZSI_BP_AIRPIN_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mc_style.functions.soap.sap.document.sap_com.Zsi_bp_airpinStub _stub = new mc_style.functions.soap.sap.document.sap_com.Zsi_bp_airpinStub(new java.net.URL(zsi_bp_airpin_address), this);
                _stub.setPortName(getzsi_bp_airpinWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("zsi_bp_airpin".equals(inputPortName)) {
            return getzsi_bp_airpin();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZSI_BP_AIRPIN");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "zsi_bp_airpin"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("zsi_bp_airpin".equals(portName)) {
            setzsi_bp_airpinEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
