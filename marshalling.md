# Marshalling 

## Marshal

### JSON to POJO
    .marshal().json(JsonLibrary.Jackson, DataType.class)
    
    .marshal(jacksonDataFormat)
    
    .marshal(new JacksonDataFormat(DataType.class))
### CSV to POJO
    .marshal().bindy(BindyType.Csv, DataType.class)

### XML to POJO
    .marshal().jaxb(DataType.class)

## Unmarshal

### POJO to JSON
    .unmarshal().json(JsonLibrary.Jackson, DataType.class)
    
    .unmarshal(jacksonDataFormat)
    
    .unmarshal(new JacksonDataFormat(DataType.class))
    
### POJO to CSV
    .unmarshal().bindy(BindyType.Csv, DataType.class)

### POJO to XML
    .unmarshal().jaxb(DataType.class)
