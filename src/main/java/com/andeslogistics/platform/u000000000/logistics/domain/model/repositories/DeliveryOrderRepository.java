package com.andeslogistics.platform.u000000000.logistics.domain.model.repositories;
import com.andeslogistics.platform.u000000000.logistics.domain.model.aggregates.DeliveryOrder;
public interface DeliveryOrderRepository {boolean existsByCode(String code);DeliveryOrder save(DeliveryOrder aggregate);}
