// Gary Mannion - G00319609

package com.sales.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sales.models.Order;

@Repository
public interface OrderInterface extends CrudRepository<Order, Long> {

	//Order findOne(Order o);

}