#Miscellaneous
```
.routeId("MyRoute")

.routeId(MyRoute.class.getName() + ".DatabaseReader")	
	
.delay(10000)
	
.timeout(20000L)

.throwException(new Exception("Dummy Exception"))

.loopDoWhile(simple("${headers.COUNTER} != ${headers.MSG_COUNT}"))
    .process(simpleJMSConsumerProcess)
.end().endCircuitBreaker()

.doTry().to("validator:wsdl/validation2.xsd")
.log("${body}").to("direct:Response")
.log(" response on Success")
.doCatch(ValidationException.class)
```
###Enrich/PollEncrich
    .pollEnrich("file://source?options")
###Validator
    .to("validator:xsd/MyXsd.xsd")
    .to("json-validator:validator/myJsonSchema.json?errorHandler=#customErrorHandler")
        				
###Xslt
    .to("xslt:MyStylesheet.xsl?saxon=true")

    .to("xslt:file:{{xslt.cdm.to.target.gettimesheet}}?saxon=true")

###Resequence
    .resequence(header("seqNum"))

    .resequence(simple("${header.priority}")).batch().timeout(30000)