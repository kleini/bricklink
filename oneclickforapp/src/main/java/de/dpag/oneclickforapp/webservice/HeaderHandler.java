/*
 * GPL v3
 */

package de.dpag.oneclickforapp.webservice;

import java.util.Set;
import java.util.TreeSet;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 * {@link HeaderHandler}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {

    private PartnerSignature partner;

    public HeaderHandler(PartnerSignature partner) {
        super();
        this.partner = partner;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (outboundProperty.booleanValue()) {
            try {
                SOAPMessage message = context.getMessage();
                SOAPFactory factory = SOAPFactory.newInstance();

                SOAPHeader header = message.getSOAPHeader();
                if (header == null) {
                    SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
                    header = envelope.addHeader();
                }

                SOAPElement partnerId = factory.createElement(new QName("http://oneclickforpartner.dpag.de", "PARTNER_ID"));
                partnerId.addTextNode(partner.getPartnerId());
                header.addChildElement(partnerId);

                SOAPElement timestamp = factory.createElement(new QName("http://oneclickforpartner.dpag.de", "REQUEST_TIMESTAMP"));
                timestamp.addTextNode(partner.getTimestamp());
                header.addChildElement(timestamp);

                SOAPElement keyPhase = factory.createElement(new QName("http://oneclickforpartner.dpag.de", "KEY_PHASE"));
                keyPhase.addTextNode(Integer.toString(partner.getKeyPhase()));
                header.addChildElement(keyPhase);

                SOAPElement signature = factory.createElement(new QName("http://oneclickforpartner.dpag.de", "PARTNER_SIGNATURE"));
                signature.addTextNode(partner.getSignature());
                header.addChildElement(signature);

                message.saveChanges();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {
        // nothing to do
    }

    @Override
    public Set<QName> getHeaders() {
        return new TreeSet<>();
    }
}
