package com.ElectroWorld.ElectroWorld.Repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.ElectroWorld.ElectroWorld.POJO.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer>  {

    @Query(value= "SELECT * FROM VENDOR_TABLE V WHERE V.vendor_username=:uname AND V.vendor_password=:pass",nativeQuery=true)
	public Vendor loginVendor(@Param("uname") String username,
			@Param("pass") String password);
    @Query(value= "SELECT * FROM VENDOR_TABLE V WHERE V.vendor_firstname=:vname",nativeQuery=true)
	public Vendor getVendor(@Param("vname") String vendor_name);
}
