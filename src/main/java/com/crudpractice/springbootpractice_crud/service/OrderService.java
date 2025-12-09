package com.crudpractice.springbootpractice_crud.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.crudpractice.springbootpractice_crud.model.Order;
import com.crudpractice.springbootpractice_crud.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

      //get by id
    public Optional<Order> getOrderByIdOptional(Long id){
        return orderRepository.findById(id)
    }


   //create order
    public Order saveOrder(Order order){
        return orderRepository.save(order)
    }

    public order updateOrder(Long id, Order order){
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}
