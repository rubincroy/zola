package com.zola.invoice.demo.service;

import java.util.List;

import com.zola.invoice.demo.model.Invoice;

public interface InvoiceService {

	List<Invoice> findAllInvoices();
	
	Invoice save(Invoice map);

	List<Invoice> getInvoiceByInvoiceNumOrPoNum(String invoiceNum, String poNumber, Integer offSet, Integer limit);
}
