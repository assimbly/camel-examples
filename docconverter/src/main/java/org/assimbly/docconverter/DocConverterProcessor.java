package org.assimbly.docconverter;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.assimbly.docconverter.DocConverter;

public class DocConverterProcessor implements Processor {

    private DocConverterEndpoint endpoint;
    private String convertedBody;

    public DocConverterProcessor(DocConverterEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public void process(Exchange exchange) throws Exception {

        Message in = exchange.getIn();
        String body = in.getBody(String.class);

        String uri = endpoint.getUriPath().toLowerCase();
        String source2target = uri.replace("docconverter://","");

        switch(source2target)
        {
            case "xml2json":
                convertedBody = DocConverter.convertXmlToJson(body);
                break;
            case "xml2yaml":
                convertedBody = DocConverter.convertXmlToYaml(body);
                break;
            case "xml2csv":
                convertedBody = DocConverter.convertXmlToCsv(body);
                break;
            case "json2xml":
                convertedBody = DocConverter.convertJsonToXml(body);
                break;
            case "json2yaml":
                convertedBody = DocConverter.convertJsonToYaml(body);
                break;
            case "json2csv":
                convertedBody = DocConverter.convertJsonToCsv(body);
                break;
            case "yaml2xml":
                convertedBody = DocConverter.convertYamlToXml(body);
                break;
            case "yaml2json":
                convertedBody = DocConverter.convertYamlToJson(body);
                break;
            case "yaml2csv":
                convertedBody = DocConverter.convertYamlToCsv(body);
                break;
            case "csv2xml":
                convertedBody = DocConverter.convertCsvToXml(body);
                break;
            case "csv2json":
                convertedBody = DocConverter.convertCsvToJson(body);
                break;
            case "csv2yaml":
                convertedBody = DocConverter.convertCsvToYaml(body);
                break;
            default:
                convertedBody = body;
        }

        in.setBody(convertedBody);

    }

}