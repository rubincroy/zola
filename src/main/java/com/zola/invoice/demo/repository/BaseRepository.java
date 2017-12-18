package com.zola.invoice.demo.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends Repository<T, ID>, JpaSpecificationExecutor<T>  {
	
	List<T> findAll();
	
	Optional<T> findOne(ID id);
	
	T save(T persisted);
	
	Page<T> findAll(Pageable pageable);
	
	Iterable<T> findAll(Sort sort);

}
