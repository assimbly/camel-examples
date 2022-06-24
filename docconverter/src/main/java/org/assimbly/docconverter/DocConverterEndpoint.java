package org.assimbly.docconverter;

import org.apache.camel.Category;
import org.apache.camel.Component;
import org.apache.camel.Processor;
import org.apache.camel.api.management.ManagedAttribute;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriPath;
import org.apache.camel.support.ProcessorEndpoint;

@UriEndpoint(
        firstVersion = "4.12.1",
        scheme = "docconverter",
        title = "DocConverter Component",
        syntax = "docconverter:conversion",
        producerOnly = true,
        category = { Category.TRANSFORMATION }
)
public class DocConverterEndpoint extends ProcessorEndpoint {

    @UriPath
    @Metadata(required = true)
    private String uri;

    private DocConverterComponent component;

    public DocConverterEndpoint(DocConverterComponent component, String uri) {
        super(uri,component);

        this.component = component;
        setUriPath(uri);
    }

    @Override
    protected Processor createProcessor() {
        return new DocConverterProcessor(this);
    }

    @Override
    public Component getComponent(){
        return (Component) component;
    }

    @ManagedAttribute(description = "Type of conversion")
    public String getUriPath() {
        return uri;
    }

    /**
     * Type of conversion: source2target
     * Source consist of (xml, json, yaml, csv) and target (xml, json, yaml,csv)
     * For example xml2json
     *
     * @param uri The type of conversion: source2target
     */
    public void setUriPath(String uri) {
        this.uri = uri;
    }

}
