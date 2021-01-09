
## Set header from constant

```
.setHeader("MyHeader").constant("MyValue")

.setHeader("MyHeader", constant("MyValue"))

.setHeader("currentPage", constant(1))

.setHeader("NotifyCamelFileComplete").constant(true)

.setHeader("Accept").constant("*/*")

.setHeader("Content-type", constant("application/x-www-form-urlencoded"))

.setHeader("CamelJmsRequestTimeout").constant("90000")

.setHeader(CxfConstants.OPERATION_NAME,	constant("GetBook"))

.setHeader("channelName", channelName.toString())
```


## Set header from simple expression

```
.setHeader("MyHeader", simple("MyValue")

.setHeader("MyInteger", simple("5", Integer.class))

.setHeader("MyBoolean", simple("true", Boolean.class))

.setHeader("Error",simple("${exception.message}"))

.setHeader("Guid").simple("${exchangeId}")

.setHeader("sObjectQuery", simple("SELECT name FROM account"))

.setHeader("MyHeader").simple("resource:classpath:mysimple.txt")

.setHeader("payrollId",simple("${body.payrollId}"))
```

## Set header from body

```
.setHeader("MyHeader", simple("${body}"))

.setHeader("MyHeader").body()
```

## Set header from jsonpath

```
.setHeader("MyHeader").jsonpath("$.ID")

.setHeader("EmployeeID").jsonpath("$.employee.EmployeeID")

.setHeader("idValue").jsonpath("workerID.idValue")
```

## Set header from xpath

```
.setHeader("xml_namespace", xpath("namespace-uri(/*)").stringResult().saxon())

.setHeader("category", xpath("/book/@category").stringResult())
```

## Set header from exchange property

```
.setHeader("CamelSplitComplete", exchangeProperty("CamelSplitComplete"))

.setHeader("Authorization").simple("Bearer ${exchangeProperty.Token}")
```

## Set header from application property

```
.setHeader("x-api-key").simple("{{api.key}}")
```

Set header from external resource:

```
.setHeader("myHeader").constant("resource:classpath:constant.txt")
```

## Set exchange headers 

```
.setHeader(Exchange.HTTP_PATH).simple("{{brm.http.path}}")
.setHeader(Exchange.HTTP_METHOD, constant("GET"))
.setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
.setHeader(HttpHeaders.AUTHORIZATION, simple("${property.token}"))
```

or 

```
.setHeader(Exchange.HTTP_PATH).simple("{{brm.http.path}}")
.setHeader(Exchange.HTTP_METHOD).simple("POST")
.setHeader(Exchange.CONTENT_TYPE).simple("application/json")
.setHeader(HttpHeaders.AUTHORIZATION, simple("${property.token}"))
```

```
.setHeader(Exchange.HTTP_RESPONSE_CODE, constant(500))
.setHeader(Exchange.FILE_NAME, body())
.setHeader(Exchange.FILE_NAME, simple("${headers.category}.xml"))
```

## Set mail headers

```
.setHeader('To', constant(mailTo))
.setHeader('From', constant(mailFrom)) 
.setHeader('Subject', constant(mailSubject)) 
```

## Set boolean headers

```
 .setHeader("param2").groovy("request.headers.param1.equals('on')")
 
 .setHeader("param2", simple("${header.param1} == 'on'", Boolean.class))
 
 .setHeader("param2").mvel("request.headers.param1 == 'on'")
```

## Removing header

### Remove specific header

```
.removeHeader("MyHeader")
```

### Remove all headers

```
.removeHeaders("*")
```

### Remove http headers

```
.removeHeaders("CamelHttp*")
```
