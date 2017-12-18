package com.zola.invoice.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zola.invoice.demo.model.Invoice;
import com.zola.invoice.demo.repository.InvoiceRepository;

@Service
public class InvoiceServiceBean implements InvoiceService {
	
	@Autowired
	private InvoiceRepository repo;

	@Override
	public List<Invoice> findAllInvoices() {
		return this.repo.findAll();
	}

	@Override
	public Invoice save(Invoice persisted) {
		return this.repo.save(persisted);
	}

	@Override
	public List<Invoice> getInvoiceByInvoiceNumOrPoNum(String invoiceNum, String poNumber, Integer offSet,
			Integer limit) {
		String invoiceCriteria = new StringBuilder().append("%").append(invoiceNum).append("%").toString();
		String poNumberCriteria = new StringBuilder().append("%").append(poNumber).append("%").toString();
		Integer lmtCrit = (null==limit)?0:limit;
		Integer offStCrit = (null==offSet)?0:(offSet);
		List<Invoice> list = this.repo.findByInvoiceNumberOrPoNumber( invoiceCriteria, poNumberCriteria);
		if(list.size() >=  offStCrit+lmtCrit ){
			return list.subList(offStCrit, offStCrit+lmtCrit);
		}
		return new ArrayList<Invoice>();
	}
	
}
