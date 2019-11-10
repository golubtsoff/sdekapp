package sdekapp.mapper;

import org.springframework.jdbc.core.RowMapper;
import sdekapp.dto.UserDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class UserDtoMapper implements RowMapper<UserDto> {
    @Override
    public UserDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        Long id = rs.getLong("id");
        String name = rs.getString("name");
        return new UserDto(id, name);
    }
}
