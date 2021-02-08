# Marshalling 

## Marshal

Marshalling is converting Objects (Plain Old Java Object) to a data format (JSON, XML etc)

### POJO to JSON

    .marshal().json(JsonLibrary.Jackson, DataType.class)    
    
    .marshal(jacksonDataFormat)
    
    .marshal(new JacksonDataFormat(DataType.class))
    
### POJO to CSV
    .marshal().bindy(BindyType.Csv, DataType.class)

### POJO to XML
    .marshal().jaxb(DataType.class)

## Unmarshal

Unnarshalling is converting a data format (JSON, XML etc) to Objects (Plain Old Java Object)

### JSON to POJO

    .unmarshal().json(JsonLibrary.Jackson, DataType.class)
    
    .unmarshal(jacksonDataFormat)
    
    .unmarshal(new JacksonDataFormat(DataType.class))
    
### CSV to POJO
    .unmarshal().bindy(BindyType.Csv, DataType.class)

### XML to POJO
    .unmarshal().jaxb(DataType.class)


## Conversion

Note for direct conversion between data format also [Assimbly docconverter](https://github.com/assimbly/docconverter) can be used.

See [Example processor](https://github.com/assimbly/connector/blob/master/connectorModule/src/main/java/org/assimbly/connector/processors/ConvertProcessor.java) for code.


