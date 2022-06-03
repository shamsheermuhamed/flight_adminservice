package com.shamsheer.flightapp.adminservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shamsheer.flightapp.adminservice.Entity.Discount;
import com.shamsheer.flightapp.adminservice.Repo.DiscountRepository;
import com.shamsheer.flightapp.adminservice.Service.DiscountService;


@RestController
@CrossOrigin
@RequestMapping("/flight")
public class DiscountController {

	@Autowired
	DiscountService service;
	
	@Autowired
	DiscountRepository repo;
	
	@GetMapping("/discounts")
	Iterable<Discount> getDiscountDetails()
	{
		return service.getDiscountdetails();
	}
	@GetMapping("/discounts/{coupon}")
	ResponseEntity<DiscountResponse> getDiscountDetails(@PathVariable String coupon)
	{
		
		if(repo.existsByCouponcode(coupon)) {
			return ResponseEntity.ok(new DiscountResponse("Coupon Found",repo.findByCouponcode(coupon).getDiscountamount()));		
		}
		else
		{
			return ResponseEntity.ok(new DiscountResponse("Coupon not found",0.0));
		}
	}
	
	@PostMapping(value="/discount/add")
	void addCoupon(@RequestBody Discount coupon)
	{
		service.addDiscount(coupon);
	}
	
	@PostMapping(value="/discount/update")
	void updateCoupon(@RequestBody Discount coupon)
	{
		repo.save(coupon);
	}
	
	@DeleteMapping(value="/discounts/delete/{couponid}")
	void deleteCouponById(@PathVariable Integer couponid)
	{
		repo.deleteById(couponid);
	}
}
