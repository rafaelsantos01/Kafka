package com.store.car.Car.service;
import com.store.car.Car.dto.OwnerPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class OwnerPostController {

    @Autowired
    private OwnerPostService ownerPostService;

    @PostMapping
    public ResponseEntity<Void> createOwner(@RequestBody OwnerPostDTO ownerPostDTO){
        ownerPostService.createOwnerPost(ownerPostDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
