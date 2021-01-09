
## Set body

```
.setBody(constant("MyValue"))

.setBody(header("MyHeader"))

.setBody(exchangeProperty("MyProperty"))

.setBody(simple(""))

.setBody().simple("<data>${body}</data>")

.setBody().simple("${camelContext.getRouteStatus('myRoute')}")

.setBody(simple("Hello from timer at ${header.firedTime}"))

.setBody(body().regexReplaceAll("\\|", "\\|\""))
```

## Convert Body

```
.convertBodyTo(String.class)
.convertBodyTo(java.lang.String.class, "UTF-8")
.convertBodyTo(String.class, "UTF-8")
.convertBodyTo(byte[].class, "iso-8859-1")
.convertBodyTo(PaymentMethodResponseBean.class)
```
