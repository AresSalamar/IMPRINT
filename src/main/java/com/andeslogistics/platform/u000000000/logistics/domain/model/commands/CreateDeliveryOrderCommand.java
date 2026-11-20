package com.andeslogistics.platform.u000000000.logistics.domain.model.commands;
import java.time.LocalDate;
import java.util.UUID;
/** CQRS command, independent of HTTP. */
public record CreateDeliveryOrderCommand(String deliveryCode, UUID warehouseId, LocalDate deliveryWindowStartDate, LocalDate deliveryWindowEndDate, Integer packageLoadQuantity,String packageLoadUnit,Integer priorityLevel,String status,String deliveryNotes) {}
