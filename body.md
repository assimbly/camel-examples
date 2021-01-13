
## Set body from constant

```
.setBody(constant("MyValue"))

.setBody().constant("MyValue")

```

## Set body from header

```
.setBody(header("MyHeader"))

.setBody().header("MyHeader")

```

## Set body from property

```
.setBody(exchangeProperty("MyProperty"))

```


## Set body from simple

```
.setBody(simple(""))

.setBody().simple("<data>${body}</data>")

.setBody().simple("${camelContext.getRouteStatus('myRoute')}")

.setBody(simple("Hello from timer at ${header.firedTime}"))

```

## Set body from Jsonpath

```
.setBody().jsonpath("access_token")

```


## Set body misc

```
.setBody(body().regexReplaceAll("\\|", "\\|\""))

```


## Convert Body

```
.convertBodyTo(String.class)
.convertBodyTo(String.class, "UTF-8")
.convertBodyTo(java.lang.String.class, "UTF-8")

.convertBodyTo(byte[].class)
.convertBodyTo(byte[].class, "iso-8859-1")

 .convertBodyTo(com.mongodb.DBObject.class) 
.convertBodyTo(PaymentMethodResponseBean.class)
```
