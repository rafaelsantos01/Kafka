package com.portal.api.Car.services;

import com.portal.api.Car.dto.OwnerPostDTO;
import com.portal.api.client.CarPostStoreClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;


    public void createOwnerCar(OwnerPostDTO ownerPostDTO){
        carPostStoreClient.ownerPostsClient(ownerPostDTO);
    }

}
