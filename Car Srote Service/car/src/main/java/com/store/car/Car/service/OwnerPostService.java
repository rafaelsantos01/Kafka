package com.store.car.Car.service;
import com.store.car.Car.dto.OwnerPostDTO;
import com.store.car.Car.entity.OwnerPostEntity;
import com.store.car.Car.repository.OwnerPostEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostService {

    @Autowired
    private OwnerPostEntityRepository ownerPostRepository;

    public void createOwnerPost(OwnerPostDTO ownerPostDTO) {

        OwnerPostEntity ownerPost = new OwnerPostEntity();
        ownerPost.setName(ownerPostDTO.getName());
        ownerPost.setType(ownerPostDTO.getType());
        ownerPost.setContactNumber(ownerPostDTO.getContactNumber());

        ownerPostRepository.save(ownerPost);
    }

}
