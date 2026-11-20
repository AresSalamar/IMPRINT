package com.andeslogistics.platform.u000000000.logistics.infrastructure.persistence;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DeliveryOrderJpaRepository extends JpaRepository<DeliveryOrderJpaEntity,Long> {boolean existsByCode(String code);}
