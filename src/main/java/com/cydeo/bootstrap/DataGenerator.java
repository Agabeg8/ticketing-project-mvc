package com.cydeo.bootstrap;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Gender;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataGenerator implements CommandLineRunner {

    RoleService roleService;
    UserService userService;

    public DataGenerator(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {


        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO managerRole = new RoleDTO(2L,"Manager");
        RoleDTO employeeRole = new RoleDTO(3L,"Employee");


        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("John", "Ksy",
                "john@cydeo.com", "Abc1", true, "45656765767", managerRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Mike", "Smith",
                "mike@cydeo.com", "Abc2", true, "54654656546", adminRole, Gender.MALE);
        UserDTO user3 = new UserDTO("Day", "Can",
                "day@cydeo.com", "Abc3", true, "45654654654", employeeRole, Gender.MALE);
        UserDTO user4 = new UserDTO("Alice", "Com",
                "alice@cydeo.com", "Abc4", true, "56464656655", managerRole, Gender.FEMALE);
        UserDTO user5 = new UserDTO("Maria", "Defoe",
                "maria@cydeo.com", "Abc5", true, "67676767676", employeeRole, Gender.FEMALE);
        UserDTO user6 = new UserDTO("hella", "Ksy",
                "hella@cydeo.com", "Abc6", true, "23242343432", employeeRole, Gender.FEMALE);
        UserDTO user7 = new UserDTO("Bred", "Fool",
                "bred@cydeo.com", "Abc7", true, "12323332323", employeeRole, Gender.MALE);
        UserDTO user8 = new UserDTO("Nai", "Kia",
                "nai@cydeo.com", "Abc8", true, "99898798999", employeeRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);
        userService.save(user6);
        userService.save(user7);
        userService.save(user8);

    }
}
