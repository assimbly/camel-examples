## Default endpoint

```
.to("direct:myEndpoint)
```

## Dynamic endpoint

```
.toD("www.someurl.com/${property.colour}")	

.toD("file://" + OUTPUT_PATH + "?FileName=${exchangeProperty.OUTPUT_FILENAME}" + "&FileExist=Append")

.toD(COMPONENT_NAME + "://" + myEndpoint + "?" + camelQueryParams)
```

## Fire and Forget

```
.setExchangePattern(ExchangePattern.InOnly)
.to("direct:myEndpoint")

.to(InOnly, "MyEndpoint")

.inOnly("direct:myEndpoint")
```

## Request and Reply

```
.setExchangePattern(ExchangePattern.InOut)
.to("direct:myEndpoint")

.to(InOut, "MyEndpoint")

.inOut("direct:myEndpoint")
```
