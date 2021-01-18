#Aggregate

###Camel
    .aggregate(constant(true), new MyAggregationStrategy()).completionPredicate(header("CamelSplitComplete").isEqualTo(true)).completionTimeout(10800000).eagerCheckCompletion()
    
###AggregationStrategy
```
public class MyAggregationStrategy implements AggregationStrategy{

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        List<Function> functions = 
        Function body = newExchange.getIn().getBody(Function.class);
        if (oldExchange == null) {
            List<Function> list = new ArrayList<>();
            list.add(body);
            newExchange.getIn().setBody(list);
            return newExchange;
        } else {
            List<Function> list = oldExchange.getIn().getBody(ArrayList.class);
            list.add(body);
            return oldExchange;
        }
    }
}
```