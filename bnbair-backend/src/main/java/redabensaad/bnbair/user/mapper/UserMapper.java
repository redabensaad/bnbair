package redabenssad.bnbair.user.mapper;

import redabenssad.bnbair.user.application.dto.ReadUserDTO;
import redabenssad.bnbair.user.domain.Authority;
import redabenssad.bnbair.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}
