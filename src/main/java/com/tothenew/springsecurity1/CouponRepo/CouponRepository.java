package com.tothenew.springsecurity1.CouponRepo;


import com.tothenew.springsecurity1.Entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository  extends JpaRepository<Coupon,Integer> {
     Coupon findByCode(String code);
}
