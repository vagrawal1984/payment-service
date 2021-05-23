package com.va.ps.api.repository;

import com.va.ps.api.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

    Payment findByOrderId(int orderId);
}
