package dao.custom;

import dto.OrderDto;

import java.sql.SQLException;
import java.util.List;

public interface OrderDao {
    boolean saveOrder(OrderDto orderDto) throws SQLException, ClassNotFoundException;
    OrderDto lastOrder() throws SQLException, ClassNotFoundException;

    List<OrderDto> allOrders() throws SQLException, ClassNotFoundException;
}
