package com.axboot.domain.prdt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.apache.ibatis.type.Alias;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.axboot.domain.BaseJpaModel;
import com.chequer.axboot.core.annotations.Comment;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@DynamicInsert
@DynamicUpdate
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "prdt_base")
@Comment(value = "")
@Alias("product")
public class Product extends BaseJpaModel<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PRDT_CD", length = 50, nullable = false)
	@NotNull(message = "제품 코드를 입력하세요") // pk라서 null이면 안됨.
	@Comment(value = "제품코드")
	private String prdtCd;

	@Column(name = "PRDT_NM", length = 50, nullable = false)
	@Comment(value = "제품명")
	private String prdtNm;

	@Column(name = "ORIGIN", length = 50, nullable = false)
	@Comment(value = "원산지")
	private String origin;

	@Column(name = "PURCHASE_PRICE", precision = 10, nullable = false)
	@Comment(value = "매입가격")
	private Integer purchasePrice;

	@Column(name = "SALES_PRICE", precision = 10, nullable = false)
	@Comment(value = "판매가격")
	private Integer salesPrice;


    @Override
    public String getId() {
        return prdtCd;
    }
}