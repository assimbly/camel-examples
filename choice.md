## Check if present

```
.choice()
	.when("MyHeader")
		.log("My header doesn't exist")
	.otherwise
		.log("My header doesn't exist")
.end()
	
.choice()
	.when(header("MyHeader"))
		.log("My header doesn't exist")
	.otherwise
		.log("My header doesn't exist")
.end()		

.choice()
	.when(exchangeProperty("MyProperty"))				
		.log("MyProperty exists")
	.otherwise
		.log("MyProperty does not exists")
.end()
```

## Strings

```
.choice()
	.when(header("MyHeader").("MyValue"))
		.log("My header is equal to MyValue")
	.otherwise
		.log("My header is not equal to MyValue")
.end()

.choice()
	.when(header("MyHeader").isEqualTo("MyValue"))
		.log("My header equals Myvalue")
	.otherwise
		.log("My header doesn't equals Myvalue")
.end()

.choice()
	.when(header("MyHeader").isNotEqualTo("MyValue"))
		.log("My header is not equal to Myvalue")
	.otherwise
		.log("My header equal Myvalue")
.end()

.choice()
	.when(simple("${in.header.CamelHttpResponseCode} == '404'"))
		.log("CamelHttpResponseCode is 404")
	.otherwise
		.log("CamelHttpResponseCode is not 404")
.end()

.choice()
	.when(simple("${in.header.EmployeeExist} == true && ${in.header.EventType} == 'remove'"))
		.log("Employee exist and eventype is remove")
	.otherwise
		.log("One or both are false")
.end()

.choice()
	.when(simple("${properties:someProperty} == 'true'"))
		.log("Some property has the value true")
	.otherwise
		.log("Some property doesn't have the value true")
.end()

.choice()
	.when(header(MyHeader).contains("MyValue"))
		.log("My header contain MyValue")
	.otherwise
		.log("My header doesn't contain MyValue")
.end()		

.choice()
	.when(header("MyHeader").startsWith("My"))				
		.log("My header start with My")
	.otherwise
		.log("My header doesn't start with My")
.end()

.choice()
	.when(header("MyHeader").startsWith("20"))				
		.log("My header start with 20")
	.otherwise
		.log("My header doesn't start with 20")
.end()
```	

## Integer

```
.choice()
	.when(header(Exchange.HTTP_RESPONSE_CODE).isEqualTo(constant(200)))
		.log("HTTP Response code is 200")
	.otherwise
		.log("HTTP Response code is not 200")
.end()
```	

## Boolean

```
.choice()
	.when().simple("${header.NotifyCamelFileComplete} != true")
		.log("NotifyCamelFileComplete is false")
	.otherwise
		.log("NotifyCamelFileComplete is true")
.end()

.choice()
	.when().simple("${header.NotifyCamelFileComplete} != true")
		.log("NotifyCamelFileComplete is false")
	.otherwise
		.log("NotifyCamelFileComplete is true")
.end()
```


## Null checks

```
.choice()
	.when().simple("${header.MyHeader} == null")
		.log("MyHeader is null")
	.otherwise
		.log("MyHeader is not null")
.end()

.choice()
	.when(header("MyHeader").isNotNull())
		.log("MyHeader is not null")
	.otherwise
		.log("MyHeader is null")
.end()
```

## Jsonpath

```
.choice()
	.when().jsonpath("$.Header[?(@.MessageType == 'Hello')]",true)
		.log("MyHeader is hello")
	.otherwise
		.log("MyHeader is not hello")
.end()
```

## Xpath

```
.choice()
	.when(xpath("//*[local-name()='ReturnCode']='200'"))
		.log("ReturnCode is 200")
	.otherwise
		.log("ReturnCode is not 200")
.end()
```
