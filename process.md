```
.process("myProcessor")

.process(new myProcessor())

.process(exchange -> exchange.getIn().setBody(fallbackResponse, EquipmentListResponse.class))	

.process(exchange -> {
	exchange.getIn().setBody("test message");
})
 
.process(exchange -> {
	String body = exchange.getIn().getBody(String.class);
	variables.put("myBody", body);
}

.process(new Processor(){
	@Override
	public void process(Exchange exchange) throws Exception {
		String message = "Hello World";
		exchange.getIn().setBody(message);
	}
	
})

.process(exchange -> {
	String[] dataArray = exchange.getIn().getBody(String.class).split(",", 2);
	channelName.append(dataArray[0]);
	exchange.getIn().setBody("{\"text\" : \"" + dataArray[1].trim() + "\"}");
})	

.process(new Processor() {
	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setHeader("JMSDeliveryMode", "1");
   }
})

.process(exchange -> {
	System.out.println(exchange.getIn().getBody());
})
				

.process(exchange -> {
	log.info("Colour decoded successfully.");
	String colour = exchange.getIn().getBody(String.class);
	exchange.setProperty("colour", colour);
})	

.process(exchange -> {
	exchange.getMessage().setBody("modified", String.class);
	exchange.getMessage().setHeader("x", "y");
})

.process(new Processor() {
	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody(exchange.getIn().getBody(String.class));
		exchange.getIn().setHeader("CamelCacheKey", sourceId);
		exchange.getIn().setHeader("CamelCacheOperation", "Update");
	}
})

.process(new Processor() {
	private int failureCounter = 0;
	@Override
	public void process(Exchange exchange) throws Exception {
		if (exchange.getIn().getHeader("JMSRedelivered", Boolean.class)) {
			exchange.getIn().setHeader("failureCounter", ++failureCounter);
		}
	}
})

.process(exchange -> {
	throw new RuntimeException("No good Pal!");
})				


.process(new Processor() {
	public void process(Exchange msg) {
		String fileName = msg.getIn().getHeader("CamelFileName").toString();
		System.out.println("CamelFileName: " + fileName);
		FileDetails fileDetails = FileDetails.builder().build();
		fileDetails.setFileName(fileName);
		fileDetails.setFilePath(exchange.getIn().getBody());
	}
})
```
