package de.dpag.oneclickforapp.webservice;

import java.io.PrintStream;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;


public class SOAPLoggingHandler implements SOAPHandler<SOAPMessageContext> {

    private static PrintStream out = System.out;

    public SOAPLoggingHandler() {
        super();
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        logToSystemOut(context);
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        logToSystemOut(context);
        return true;
    }

    @Override
    public void close(MessageContext context) {
        // nothing to clean up
    }

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    private void logToSystemOut(SOAPMessageContext context) {
        Boolean outboundProperty = (Boolean) context.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty.booleanValue()) {
            out.println("\nOutbound message:");
        } else {
            out.println("\nInbound message:");
        }

        SOAPMessage message = context.getMessage();
        try {
            message.writeTo(out);
            out.println();
        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
}
