package com.andeslogistics.platform.u000000000.logistics.interfaces.rest;
import java.time.LocalDate;
import java.util.UUID;
/** Representation returned after successful creation. */
public record DeliveryOrderResource(Long id,String deliveryCode,String warehouseId,String deliveryWindowStartDate,String deliveryWindowEndDate,Integer packageLoadQuantity,String packageLoadUnit,Integer priorityLevel,String status,String deliveryNotes) {}
