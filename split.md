## Split 

```
.split(body())

.split(header("MyHeader"))

.split(body(String.class).tokenize("\n"))

.split(body().tokenize(LINE_FEED)).streaming()	

.split(body().tokenize(",")).streaming()

.split().tokenizeXML("Entry")

.split().tokenize(System.lineSeparator()).aggregationStrategy(new YourAggregationStrategyClass())
```


## Split with method

```
.split().method(new SplitBean(), "splitMessage")

.split().method(new SplitterBean(), "splitServiceRecords")

.split().method(myFunkySplitterBean, "splitCommands")		

.split().method(ServiceCommandSplitter.class, "splitCommands")
```


## Split with xpath

```
.split(xpath("//foo/bar"))

.split(xpath("//*[local-name()='files']/*"))
```


## Split with jsonpath

```
.split().jsonpath("$.[*]").aggregationStrategy(new SupplierAggregationStrategy())

.split().jsonpath("events[*].data.output.organizationRole")

.split().jsonpathWriteAsString("$.store.book[*]")

.split().jsonpath("$.store.book[*]")

.split().jsonpath("$").streaming()

.split().jsonpathWriteAsString("$.journalEntries")

.split().jsonpathWriteAsString("events")

.split(ExpressionBuilder.languageExpression("jsonpath","$")
```
