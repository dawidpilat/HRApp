package pl.hrapp.domain.data;

import pl.hrapp.domain.api.DataInfo;
import pl.hrapp.domain.common.BaseDao;
import pl.hrapp.domain.user.User;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DataDAO extends BaseDao {



    public List<Data> findAll() {
        final String query = """
                SELECT
                    user_id,name, surname,username,address, email, marital_status,data_id
                FROM
                    data d
                    
                
                """;
        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            List<Data> allDatas = new ArrayList<>();
            while (resultSet.next()) {
                Data data = mapRow(resultSet);
                allDatas.add(data);
            }
            return allDatas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }







    public void save(Data data) {
        final String query = """
                        INSERT INTO
                            data (user_id,name, surname,username,address, email, marital_status)
                        VALUES
                            (?, ?, ?, ?, ?, ?, ?)
                        """;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            statement.setInt(1, data.getUser_id());
            statement.setString(2, data.getName());
            statement.setString(3, data.getSurname());
            statement.setString(4, data.getUsername());
            statement.setString(5, data.getAddress());
            statement.setString(6, data.getEmail());
            statement.setString(7, data.getMarital_status());


            statement.executeUpdate();
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                data.setData_id(generatedKeys.getInt(1));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private static Data mapRow(ResultSet set) throws SQLException {

        int user_id = set.getInt("user_id");
        String name = set.getString("name");
        String surname = set.getString("surname");
        String username = set.getString("username");
        String address = set.getString("address");
        String email = set.getString("email");
        String marital_status = set.getString("marital_status");
        int data_id = set.getInt("data_id");

        return new Data(user_id, name, surname, username,  address, email, marital_status,data_id);
    }

}