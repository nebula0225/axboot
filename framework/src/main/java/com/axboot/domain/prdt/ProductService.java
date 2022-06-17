package com.axboot.domain.prdt;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.querydsl.core.BooleanBuilder;

import javax.inject.Inject;

import com.axboot.domain.BaseService;
import com.chequer.axboot.core.parameter.RequestParams;
import java.util.List;

@Service
public class ProductService extends BaseService<Product, String> {
    private ProductRepository productRepository;

    @Inject
    public ProductService(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }
    
    public List<Product> getAll(RequestParams<Product> rp) {
    	return productRepository.findAll();
    }

    public List<Product> gets(RequestParams<Product> requestParams) {
    	String prdtCd=requestParams.getString("prdtCd", "");
    	String prdtNm=requestParams.getString("prdtNm", "");
    	String filter=requestParams.getString("filter");
    	
    	// JPA 쿼리의 조건 설정인 where뒤의 조건을 생성해주는 것
    	BooleanBuilder builder = new BooleanBuilder();
    	
    	// prdtCd가 오면 where prdtCd = prdtCd 동일
//    	if(isNotEmpty(prdtCd)) {
//    		builder.and(qProduct.prdtCd.eq(prdtCd));
//    	}
//    	
//    	if(isNotEmpty(prdtNm)) {
//    		builder.and(qProduct.prdtNm.eq(prdtNm));
//    	}
//    	
//    	List<Product> prdtList = select().from(qProduct).where(builder).orderBy(qProduct.prdtCd.asc(), 
//    			qProduct.prdtNm.asc()).fetch();
    	
//    	if(isNotEmpty(filter)) {
//    		prdtList = filter(prdtList, filter);
//    	}
    	
    	List<Product> prdtList = productRepository.findAll();
    	
        return prdtList;
    }
    
    // 저장
    @Transactional
    public void savePrdt(List<Product> product) {
    	save(product);
    }
}