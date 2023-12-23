package dao.custom;
import dto.ItemDto;

import java.sql.SQLException;
import java.util.List;

public interface ItemDao {
    boolean saveItem(ItemDto dto) throws SQLException, ClassNotFoundException;
    boolean updateItem(ItemDto dto) throws SQLException, ClassNotFoundException;
    boolean deleteItem(String id) throws SQLException, ClassNotFoundException;
    List<ItemDto> allItem() throws SQLException, ClassNotFoundException;
    ItemDto getItem(String id) throws SQLException, ClassNotFoundException;
}