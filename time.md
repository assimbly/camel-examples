##Time
```
.setHeader("MyHeader").simple("${date:now:yyyyMMdd}")

.setHeader("MyHeader").simple("${date:now:HH:mm:ss}")

.setHeader("MyHeader").simple("${date:now:dd-MM-yyyy HH:mm}

.setHeader("MyHeader").simple("${date:now:yyyy-MM-dd'T'HH:mm:ss:SSS}")

.setHeader("MyHeader").simple("${date:now:dd-MM-yyyy HH:mm z}")

.setHeader("MyHeader").simple("${date:now+24h:yyyMMdd}")

.setHeader("MyHeader").simple("${bean:java.lang.System?method=currentTimeMillis}") 

.transform().simple("The today is ${date:now:yyyyMMdd} and it is a great day.")

.setHeader("MyHeader").groovy("new java.text.SimpleDateFormat('EEE, dd MMM yyyy HH:mm:ss zzz', java.util.Locale.US).parse(request.headers.myOldHeader)")

.setBody(simple("Message at ${date:now:yyyy-MM-dd HH:mm:ss}"))

.process(new Processor(){
	public void process(Exchange ex){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1); 
		ex.getIn().setHeader("yesterday",cal.getTime());
```