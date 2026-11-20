package com.andeslogistics.platform.u000000000.logistics.interfaces.rest;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.UUID;
/** POST request; audit fields and id are server-managed. */
public record CreateDeliveryOrderRequest(
 @NotBlank String deliveryCode,
 @NotNull UUID warehouseId,
 @NotNull LocalDate deliveryWindowStartDate,
 @NotNull LocalDate deliveryWindowEndDate,
 @NotNull @Positive Integer packageLoadQuantity,
 @NotBlank String packageLoadUnit,
 @NotNull @Min(1) @Max(5) Integer priorityLevel,
 String status,
 String deliveryNotes) {}
