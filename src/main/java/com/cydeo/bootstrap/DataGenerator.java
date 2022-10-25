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

        UserDTO user1 = new UserDTO("John", "Kesy",
                "john@cydeo.com", "Absc1", true, "45656765767", managerRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Mike", "Smith",
                "mike@cydeo.com", "Absc2", true, "54654656546", managerRole, Gender.MALE);
        UserDTO user3 = new UserDTO("Day", "Can",
                "john@cydeo.com", "Absc3", true, "45654654654", managerRole, Gender.MALE);
        UserDTO user4 = new UserDTO("Alice", "Com",
                "john@cydeo.com", "Absc4", true, "56464656655", managerRole, Gender.FEMALE);
        UserDTO user5 = new UserDTO("Maria", "Defoe",
                "john@cydeo.com", "Absc4", true, "67676767676", managerRole, Gender.MALE);
        UserDTO user6 = new UserDTO("John", "Kesy",
                "john@cydeo.com", "Absc5", true, "23242343432", managerRole, Gender.MALE);
        UserDTO user7 = new UserDTO("John", "Kesy",
                "john@cydeo.com", "Absc3", true, "12323332323", managerRole, Gender.MALE);
        UserDTO user8 = new UserDTO("John", "Kesy",
                "john@cydeo.com", "Absc4", true, "99898798999", managerRole, Gender.MALE);

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
