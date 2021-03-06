package ru.vtb24.it.ivr.ivrtypes.v1_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.3
 * 2017-08-20T16:03:14.235+03:00
 * Generated source version: 2.7.3
 * 
 */
@WebService(targetNamespace = "http://www.vtb24.ru/IT/IVR/IVRTypes/v1.0", name = "GetCreditClientInfoPort")
@XmlSeeAlso({ru.vtb24.it.ivr.ivrtypes.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetCreditClientInfoPort {

    @WebMethod(operationName = "GetCreditClientInfo")
    @WebResult(name = "GetCreditClientInfoResponse", targetNamespace = "http://www.vtb24.ru/IT/IVR/IVRTypes/v1.0", partName = "GetCreditClientInfoResponse")
    public ru.vtb24.it.ivr.ivrtypes.v1.GetCreditClientInfoResponse getCreditClientInfo(
        @WebParam(partName = "GetCreditClientInfoRequest", name = "GetCreditClientInfoRequest", targetNamespace = "http://www.vtb24.ru/IT/IVR/IVRTypes/v1.0")
        ru.vtb24.it.ivr.ivrtypes.v1.GetCreditClientInfoRequest getCreditClientInfoRequest
    );
}
