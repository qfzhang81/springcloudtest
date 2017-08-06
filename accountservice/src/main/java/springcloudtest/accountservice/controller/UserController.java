package springcloudtest.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springcloudtest.accountservice.service.UserService;
import springcloudtest.model.UserEntity;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    protected UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserEntity> findById(@PathVariable("id") Long id) {
        UserEntity userEntity = null;
        try {
            if (id != null) {
                userEntity = userService.get(id);
            }
        } catch (Exception ex) {
            return new ResponseEntity<UserEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (userEntity == null) {
            return new ResponseEntity<UserEntity>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<UserEntity>(userEntity, HttpStatus.OK);
    }
}
