package com.analytics.data.car.service;

import com.analytics.data.car.dto.CarPostDTO;
import com.analytics.data.car.entity.BrandAnalyticsEntity;
import com.analytics.data.car.entity.CarModelAnalyticsEntity;
import com.analytics.data.car.entity.CarModelPriceEntity;
import com.analytics.data.car.repository.BrandAnalyticsEntityRepository;
import com.analytics.data.car.repository.CarModelAnalyticsEntityRepository;
import com.analytics.data.car.repository.CarModelPriceEntityRepository;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostAnalyticsService {

    @Autowired
    private BrandAnalyticsEntityRepository brandAnalyticsRepository;

    @Autowired
    private CarModelAnalyticsEntityRepository carModelAnalyticsRepository;

    @Autowired
    private CarModelPriceEntityRepository carPriceAnalyticsRepository;

    public void saveDataAnalytics(CarPostDTO carPostDTO) {

        saveBrandAnalytics(carPostDTO.getBrand());
        saveCarModelAnalytics(carPostDTO.getModel());
        saveCarModelPriceAnalytics(carPostDTO.getModel(),carPostDTO.getPrice());
    }

    private void saveBrandAnalytics(String brand){

        BrandAnalyticsEntity brandAnalyticsEntity = new BrandAnalyticsEntity();

        brandAnalyticsRepository.findByBrand(brand).ifPresentOrElse(item->{
            item.setPosts(item.getPosts()+1);
            brandAnalyticsRepository.save(item);
        }, ()-> {
            brandAnalyticsEntity.setBrand(brand);
            brandAnalyticsEntity.setPosts(1L);
            brandAnalyticsRepository.save(brandAnalyticsEntity);
        });

    }

    private void saveCarModelAnalytics(String carModel){

        CarModelAnalyticsEntity carModelAnalyticsEntity = new CarModelAnalyticsEntity();

        carModelAnalyticsRepository.findByModel(carModel).ifPresentOrElse(item->{
            item.setPosts(item.getPosts()+1);
            carModelAnalyticsRepository.save(item);
        }, ()-> {
            carModelAnalyticsEntity.setModel(carModel);
            carModelAnalyticsEntity.setPosts(1L);
            carModelAnalyticsRepository.save(carModelAnalyticsEntity);
        });

    }

    private void saveCarModelPriceAnalytics(String carModel, Double price){

        CarModelPriceEntity carModelPriceEntity = new CarModelPriceEntity();

        carModelPriceEntity.setModel(carModel);
        carModelPriceEntity.setPrice(price);
        carPriceAnalyticsRepository.save(carModelPriceEntity);

    }


}
