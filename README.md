# dummy-telco-server-for-simple-ussd

A dummy server that hosts the web APIs integrated in simple-mfs-ussd-java.

## URLS and request format
### Banglalink
URL: `http://localhost:portNum/mybl`
The request must be sent as a JSON
{trackingid:gxznD3SogT09,paymentfrom:111,paymentto:1777777777,amount:myMFS_54.0}

{
"text": "Success",
"status": "success",
"trackingID": "gxznD3SogT09",
"time": "27-08-2023 12:11"
}

### Grameenphone
URL: `http://localhost:6811/mygp`

{
transactionid: 13223,
agent: 112,
recipient: nagad,
topup: 20.5
}
{
"message": "Top-up Success",
"stat": "okay",
"transactionID": "13223",
"when": "27-08-2023 12:12"
}

### Robi
URL: `http://localhost:6811/myrobi`

[//]: # (<param>)

[//]: # (    <transactionid>testid123</transactionid>)

[//]: # (    <paymentfrom>nagad</paymentfrom>)

[//]: # (    <topupacc>114</topupacc>)

[//]: # (    <amount>50</amount>)

[//]: # (</param>)

[//]: # (<XmlRobiRes>)

[//]: # (    <resp>Top-up Success</resp>)

[//]: # (    <success>Yes</success>)

[//]: # (    <transactionid>testid123</transactionid>)

[//]: # (    <localtime>27-08-2023 10:45</localtime>)

[//]: # (</XmlRobiRes>)

### Teletalk
URL: `http://localhost:6811/mytele`

[//]: # (<xmltt>)

[//]: # (    <topupid>testid123</topupid>)

[//]: # (    <sender>nagad</sender>)

[//]: # (    <target>114</target>)

[//]: # (    <topup>50</topup>)

[//]: # (</xmltt>)

[//]: # ()
[//]: # (<XmlTTRes>)

[//]: # (    <val>Recharged Successfully</val>)

[//]: # (    <topupstatus>complete</topupstatus>)

[//]: # (    <topupid>testid123</topupid>)

[//]: # (    <modified>27-08-2023 12:14:01</modified>)

[//]: # (</XmlTTRes>)