package com.example.Asset.Management.service;

import com.example.Asset.Management.model.AssetsModel;
import com.example.Asset.Management.model.AssignAssetsToEmployeeModel;
import com.example.Asset.Management.repository.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
public class AssetsService {

    @Autowired
    private AssetsRepository assetsRepository;

    public String saveAssets(List<AssetsModel> assetsModel) {
        for (AssetsModel record : assetsModel) {
            AssetsModel model = new AssetsModel();
            model.setAssetName(record.getAssetName());
            model.setAssetModel(record.getAssetModel());
            model.setAssetQuantity(record.getAssetQuantity());
            model.setCreatedBy(record.getAssetName());
            model.setCreateDate(LocalDateTime.now());
            model.setLastUpdatedBy(record.getAssetName());
            model.setLastUpdateDate(LocalDateTime.now());
            assetsRepository.save(model);
        }
        return "Assets details save successfully";
    }

    public List<AssetsModel> getAllAssets() {
        return assetsRepository.findAll();
    }

    public Object getAssetsById(Long id) {
        return assetsRepository.findById(id);
    }

    public String assetsUpdate(Long id, AssetsModel assetsModel) {
        Optional<AssetsModel> modelOptional = assetsRepository.findById(id);
        if (modelOptional.isPresent()) {
            AssetsModel model1 = modelOptional.get();
            model1.setAssetModel(assetsModel.getAssetModel());
            model1.setAssetName(assetsModel.getAssetName());
            model1.setAssetQuantity(assetsModel.getAssetQuantity());
            assetsRepository.save(model1);
            return "Assets record update successfully";
        } else {
            return "This record does not exits";

        }
    }

    public String getDeleteById(Long id) {
        try {
            if (assetsRepository.existsById(id)) {
                assetsRepository.deleteById(id);
                return "Assets deleted successfully. ";
            } else {
                return "This record does not exits";
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public String assignAssetsToEmployee(List<AssetsModel> assetsModel) {
        AssignAssetsToEmployeeModel model = new AssignAssetsToEmployeeModel();

        {

        }


        return null;
    }}