# zola - Spring boot + Swagger UI + Embedded H2
# Step 1: To run the application from cmd prompt ( Prerequisites: Java 8, Maven )
mvn spring-boot: run

# Step 2: Download the project and import to Eclipse IDE and Run as Java Application.

# To test the application, Use any Swagger UI or any Browser REST Client.
# Swagger-UI URL : http://localhost:8080/swagger-ui.html

 
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
#URL: http://localhost:8080/v1/invoices?po_number=C4D&invoice_number=ABC&offset=0&limit=5
#header: No header
#METHOD: GET
