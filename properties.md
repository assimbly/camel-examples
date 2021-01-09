## Set property from body 

```
.setProperty("MyProperty", body())

.setProperty("MyProperty").body()

.setProperty("MyProperty").simple("${body}")
```

## Set property from constant

```
.setProperty("MyProperty", constant("MyValue"))

.setProperty("MyProperty").constant("MyValue"))
``` 

## Set property from header

```
.setProperty("MyProperty", header("MyHeader"))
```

## Set property from xpath

```
.setProperty("myProperty").xpath("//MyProperty", String.class)
```

## Other examples

```
.setProperty("MyProperty").simple("${header.MyHeader}")
 
.setProperty("MyProperty", MyVar.toString())

.setProperty("MyProperty").simple("${exchangeProperty.StatusMsg} == null ? 'ee2e2e2' : 'fffffff'")

.setProperty("myProperty", method(MyBean.class, "myMethod"))

.setProperty("MyProperty").exchange(ex -> new MyBean())

.setProperty("uid", uuid.toString()

.setProperty(CamelConstants.APPLICATION_NAMESPACE).constant(_serviceName.getNamespaceURI())

.setProperty("endpointUri", new ConstantExpression(mockDefinition.getEndpointUri()))

.setProperty(PROCESS_KEY_PROPERTY, simple("file:name"))

.setProperty(Exchange.ROUTE_STOP, Boolean.TRUE);

.setProperty(CAPTURED_OUT_MESSAGES_MAP, outMessagesMap);
```

## Remove property

```
.removeProperty("MyProperty")
```
