package com.andeslogistics.platform.u000000000.logistics.domain.model.valueobjects;
/** Validated immutable business code. */
public record DeliveryCode(String code) {
 public DeliveryCode {if(code==null||code.isBlank()) throw new IllegalArgumentException("Code cannot be blank"); code=code.trim();}
}
