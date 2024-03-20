package com.example.Asset.Management.service;

import com.example.Asset.Management.model.AssetsModel;
import com.example.Asset.Management.repository.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class AssetsService {

     @Autowired
    private AssetsRepository assetsRepository;
      public String saveAssets(List<AssetsModel> assetsModel) {                //post api for saving records
          for (AssetsModel record : assetsModel) {
              AssetsModel model = new AssetsModel();
              model.setAssetName(record.getAssetName());
              model.setAssetModel(record.getAssetModel());
              model.setAssetQuantity(record.getAssetQuantity());
              assetsRepository.save(record);
          }
          return "Assets details save successfully";
      }
    public List<AssetsModel> getAllAssets()             //Get api for fetch all data
    {
        return assetsRepository.findAll();
    }


    public  String assetsUpdate(Long id, AssetsModel assetsModel)        // for put for update changes
    {
//          AssetsModel model=assetsRepository.findById(id).get();
        Optional<AssetsModel> modelOptional = assetsRepository.findById(id);


        if(modelOptional.isPresent())                                                   //validation for id not exits
          {
              AssetsModel model1=modelOptional.get();
              model1.setAssetModel(assetsModel.getAssetModel());
              model1.setAssetName(assetsModel.getAssetName());
              model1.setAssetQuantity(assetsModel.getAssetQuantity());
              assetsRepository.save(model1);
              return "Assets record update successfully";
          }
          else
          {
              return "This record does not exits";

          }
    }

    public String getDeleteById(Long id)                                    //delete api for id delete
    {
      try {
          if (assetsRepository.existsById(id))
          {
              assetsRepository.deleteById(id);
              return "Id successfully deleted ";
          }
          else
          {
              return "This record does not exits";
          }
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
    }
}
