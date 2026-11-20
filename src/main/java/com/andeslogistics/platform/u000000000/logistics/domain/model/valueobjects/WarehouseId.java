package com.andeslogistics.platform.u000000000.logistics.domain.model.valueobjects;
import java.util.UUID;
/** External bounded-context identifier. */
public record WarehouseId(UUID value) {public WarehouseId {if(value==null) throw new IllegalArgumentException("Identifier is required");}}
