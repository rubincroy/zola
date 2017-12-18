# zola - Spring boot
# To run the application from cmd prompt ( Prerequisites: Java 8, Maven )
mvn spring-boot: run

# To test, Use any REST Client. 
#1. Insertion of Invoice
#URL: http://localhost:8080/v1/invoices
#header: Content-Type: application/json
#METHOD: POST
#Request Body:
{
   "invoice_number":"ABC12352",
   "po_number":"X1B23C4D2E",
   "due_date":"2017-03-15",
   "amount_cents":100000
}

#2. Search of invoice(s) by invoice_number or po_number criteria, supporting pagination by
#limit and offset. This will return the list of invoices matching the criteria sorted by
#created_at from newest to oldest.
#URL: http://localhost:8080/v1/invoices
#header: Content-Type: application/json
#METHOD: POST
#Request Body:
{
   "invoice_number":"ABC12352",
   "po_number":"X1B23C4D2E",
   "due_date":"2017-03-15",
   "amount_cents":100000
}