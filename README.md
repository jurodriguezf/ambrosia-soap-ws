# SOAP WS

## Build and run

Use the `mvn clean install -U ` maven command to build the executable, once it is built, this can be executed using `java -jar target/soap-ws-0.0.1-SNAPSHOT.jar`.

## Usage

This SOAP service uses the `service/receipt` endpoint and uses this XML SOAP request body with this header `Content-Type: text/xml`.

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:sch="http://www.howtodoinjava.com/xml/school">
   <soapenv:Header/>
   <soapenv:Body>
      <sch:StudentDetailsRequest>
         <sch:studentCode>1</sch:studentCode>
      </sch:StudentDetailsRequest>
   </soapenv:Body>
</soapenv:Envelope>
```

This service responds with this body.

```xml
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:StudentDetailsResponse xmlns:ns2="http://www.howtodoinjava.com/xml/school">
            <ns2:Student>
                <ns2:studentCode>1</ns2:studentCode>
                <ns2:amount>100.0</ns2:amount>
                <ns2:description>description</ns2:description>
                <ns2:dueDate>2018-01-01</ns2:dueDate>
                <ns2:overdueDate>2018-01-01</ns2:overdueDate>
                <ns2:invoiceNumber>1</ns2:invoiceNumber>
                <ns2:status>pending</ns2:status>
            </ns2:Student>
        </ns2:StudentDetailsResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

