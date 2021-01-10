## Basic

```
.transform().constant("OK")

.transform(body().prepend("Hello "))

.transform(body().append(" World!"))

.transform().simple("Hello ${header.name}")

.transform(simple(“Hello ${body}”));
```

## Replace

```
.transform(body().regexReplaceAll("milk", "Milk"))

.transform(body().regexReplaceAll("\n", "<br/>"))

.transform(simple( "${body.replace('&', '&#38;')}"))

.transform().simple("${body.toUpperCase()}");  
```

## Method

```
.transform().method(MyBusinessClass.class, "doSomething")

.transform().method("Test", "alter")
 ```

## XML & JSON

```
.transform(xquery(“<books>{ for $x in /bookstore/book ” + “where $x/price>30 order by $x/title ” + “return $x/title }</books>”));
	 
.transform().constant("resource:classpath:config.xml");
	  
.transform().jsonpath("$.results[0].formattedAddress")
```
	
