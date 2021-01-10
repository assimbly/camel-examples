## Basic
```
.log("My Log Message")

.log("${body}")

.log("===============>>> NEW MESSAGE: ${body}"); 

.log("Received Body is  ${body}   and header info is   ${headers}  ");
		
.log("${header.deptid}")

.log("${exchangeId}")

.log("Reading of file ${header.CamelFileNameOnly} complete.")

.log("Value of primaryOrgId = " + "${exchangeProperty.primaryOrgId}")

```

## With Loglevel

```
.log(LoggingLevel.INFO, "Transaction file")		

.log(LoggingLevel.INFO, "${body}")

.log("Error handler parent. Body is: ${body}")

.log(LoggingLevel.INFO, "Incoming message ${body} with headers ${headers}");

.log(LoggingLevel.INFO, "${file:name}")

.log(LoggingLevel.DEBUG, this.getClass().getName(), "${headers} ${body}")
```


## Logging with To endpont

```
.to("log:myclass.Succes")

.to("log:myclass.Failed?level=ERROR&showAll=true&multiline=true&style=Fixed")
```
