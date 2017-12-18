package com.zola.invoice.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zola.invoice.demo.model.Invoice;

public interface InvoiceRepository extends BaseRepository<Invoice, String>{

	@Query(" from Invoice where invoiceNumber like :invoiceNum OR poNumber like :poNumber order by createdAt desc")
	List<Invoice> findByInvoiceNumberOrPoNumber(@Param("invoiceNum") String invoiceNum, @Param("poNumber") String poNumber);
	
}
