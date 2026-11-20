package com.andeslogistics.platform.u000000000.logistics.domain.model.valueobjects;
/** Immutable positive quantity and associated unit. */
public record PackageLoad(Integer quantity,String unit) {
 public PackageLoad {if(quantity==null||quantity<=0||unit==null||unit.isBlank()) throw new IllegalArgumentException("Invalid quantity or unit");unit=unit.trim();}
 public PackageLoad increaseBy(Integer additionalQuantity) {
  if(additionalQuantity==null||additionalQuantity<=0||((long)quantity+additionalQuantity)>Integer.MAX_VALUE) throw new IllegalArgumentException("Invalid increment");
  return new PackageLoad(quantity+additionalQuantity,unit);
 }
}
