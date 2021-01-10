## Filter by header

```
.filter(header("CamelFileLastModified").isGreaterThan(tenDaysBack))
.filter(header("head").isEqualTo("B"))
.filter(header("foo").isEqualTo("bar"))
.filter(header(HTTP_RESPONSE_CODE).isEqualTo(200))
```

## Filter by body

```
.filter(body().contains("Foo"))
.filter(body().convertToString().contains("MyValue"))
.filter(body().isNotEqualTo(3))
```

## Filter by simple

```
.filter(simple('''${header.CACT} == "OBS"'''))
.filter(simple('''${header.CDPO} == "SAT" or ${header.CDPO} == "LYO"'''))
```

## Filter by JsonPath

```
.filter().jsonpath("$.[?(@.customerId == '${header.ID}')]")
```

## Filter by Xpath

```
.filter().xpath("/person[@name='James']")
.filter().xpath("//*[local-name()='UserImport']")
.filter().xpath("/env:Envelope/env:Header/equipmentType/text()='WCA'")
```

## Filter by OGNL

```
.filter().ognl("getRequest().getBody().contains('iphone')")
```

## Filter by method

```
.filter().method(MyBean.class, "isGoldCustomer")
.filter().method(DiagnosticDateFilter.class, "diagnosedAfterLastRun")
```

## Filter by Class

```
.filter(new StubRunnerCamelPredicate(entries.getValue()))
```
