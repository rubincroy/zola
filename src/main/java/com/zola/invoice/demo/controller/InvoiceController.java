package com.zola.invoice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zola.invoice.demo.dto.InvoiceDTO;
import com.zola.invoice.demo.model.Invoice;
import com.zola.invoice.demo.service.InvoiceService;

import ma.glasnost.orika.MapperFacade;

@RestController
@RequestMapping("/v1")
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	@Autowired
	private MapperFacade mapper;
		
	@RequestMapping(method= RequestMethod.POST, value="/invoices")
	public InvoiceDTO saveInvoice(@RequestBody InvoiceDTO dto){
		return this.mapper.map(this.invoiceService.save(this.mapper.map(dto, Invoice.class)), InvoiceDTO.class);		
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/invoices")
	public List<InvoiceDTO> getAllInvoices(@RequestParam(value="invoice_number", required=false) String invoiceNum,
			@RequestParam(value="po_number", required=false) String poNumber, @RequestParam(value="limit", required=false) Integer limit,
			@RequestParam(value="offset", required=false) Integer offSet){
		List<Invoice> returnList = this.invoiceService.getInvoiceByInvoiceNumOrPoNum(invoiceNum, poNumber, offSet, limit);
		return this.mapper.mapAsList(returnList, InvoiceDTO.class);		
	}
}
