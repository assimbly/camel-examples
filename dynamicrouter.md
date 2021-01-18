## Camel EIP

```
.dynamicRouter(method(MyDynamicRouter.class, "pageRequest"))
```

## Method
```
// Returns the next request url, or null when the last iteration is reached
public class MyDynamicRouter {
    public void pageRequest(Exchange exchange){
        
        // Initialize nextRequest as null as the method must return null at the final iteration.
        // Otherwise it will get stuck in an endless loop.
        String nextRequest = null;

        Object body = exchange.getIn().getBody();

        if(/* initial condition, usually: body == null */){
            nextRequest = "direct:myNextRequest";
        } else if (/* continuing condition, something like: body.size() == maxSize */)
            nextRequest = "direct:myNextRequest";
        } else if (/* final condition, something like: body.size() < maxSize */) {
            // Not necessary, but end logic (like setting headers) could be done here 
            nextRequest = null;
        }

        return nextRequest;
    }
}
```