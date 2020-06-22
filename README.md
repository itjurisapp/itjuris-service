# api-core-rest

API Rest with Spring Boot, RabbitMQ and MongoDB

Exemple Postman: 
curl --location --request POST 'localhost:8080/itjurisapi/process/v1/basic-datas' \
--header 'Content-Type: application/json' \
--data-raw '{
  "proceduralClass": 123,
  "codeLocation": 123,
  "competence": 123,
  "linkedProcess": "cnj",
  "BindingProcessModality": "cnj",
  "priority": "cnj",
  "lawsuitValue": 1,
  "legalAssistance": true,
  "secrecyLevel": 1,
  "dateAjuizamento": "2020-06-22",
  "otherParameter": "cnj"
}'
