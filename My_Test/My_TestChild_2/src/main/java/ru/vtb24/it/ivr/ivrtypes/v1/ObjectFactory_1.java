
package ru.vtb24.it.ivr.ivrtypes.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.vtb24.it.ivr.ivrtypes.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.vtb24.it.ivr.ivrtypes.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCreditClientInfoRequest }
     * 
     */
    public GetCreditClientInfoRequest createGetCreditClientInfoRequest() {
        return new GetCreditClientInfoRequest();
    }

    /**
     * Create an instance of {@link GetCreditClientInfoResponse }
     * 
     */
    public GetCreditClientInfoResponse createGetCreditClientInfoResponse() {
        return new GetCreditClientInfoResponse();
    }

}
