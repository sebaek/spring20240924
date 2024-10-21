package com.example.spring20240924.mapper;

import com.example.spring20240924.dto.c38.Customer;
import com.example.spring20240924.dto.c38.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Mapper08 {

    @Update("""
            UPDATE Customers
            SET CustomerName = '한강',
                ContactName = '노벨상',
                Address = '서울',
                Country= '한국'
            WHERE CustomerId = 2
            """)
    int update1();

    @Update("""
            UPDATE Customers
            SET CustomerName = #{name},
                ContactName = #{contactName},
                Address = #{address},
                City = #{city},
                PostalCode = #{postalCode},
                Country = #{country}
            WHERE CustomerId = #{id}
            """)
    int update2(String name,
                String contactName,
                String address,
                String city,
                String postalCode,
                String country,
                Integer id);

    @Update("""
            UPDATE Customers
            SET CustomerName = #{name},
                ContactName = #{contactName},
                Address = #{address},
                City = #{city},
                PostalCode = #{postalCode},
                Country = #{country}
            WHERE CustomerId = #{id}
            """)
    int update3(Customer c);

    @Update("""
            UPDATE Employees
            SET FirstName = #{firstName},
                LastName = #{lastName},
                BirthDate = #{birthDate},
                Photo = #{photo},
                Notes = #{notes}
            WHERE EmployeeId = #{id}
            """)
    int update4(Employee employee);

    @Select("""
            SELECT CustomerId id,
                   CustomerName name,
                   ContactName contactName,
                   Address address,
                   City city,
                   PostalCode postalCode,
                   Country country
            FROM Customers
            WHERE CustomerId = #{id}
            """)
    Customer select1(Integer id);
}
