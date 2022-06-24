package org.assimbly.docconverter;

import org.apache.camel.Endpoint;
import org.apache.camel.support.DefaultComponent;

import java.util.Map;

public class DocConverterComponent extends DefaultComponent {

    @Override
    protected Endpoint createEndpoint(String uri, String context, Map<String, Object> parameters) {

        DocConverterEndpoint endpoint = new DocConverterEndpoint(this, uri);

        return endpoint;
    }
}
