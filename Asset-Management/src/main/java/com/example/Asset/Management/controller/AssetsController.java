package com.example.Asset.Management.controller;
import com.example.Asset.Management.model.AssetsModel;
import com.example.Asset.Management.service.AssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assets")
public class AssetsController {

    @Autowired
    private AssetsService assetsService;

    @PostMapping("/saveAssets")
    public String saveAssets(@RequestBody List<AssetsModel >assetsModel)
    {
        return assetsService.saveAssets(assetsModel);
    }

@GetMapping("/getAllAssets")
    public List<AssetsModel>getAllAssets()
{
    return assetsService.getAllAssets();
}
@PutMapping("/{id}")
    public String assetsUpdate(@PathVariable Long id,@RequestBody AssetsModel assetsModel)
{
    return assetsService.assetsUpdate(id,assetsModel);
}
@DeleteMapping("/getDeleteById/{id}")
    public String getDeleteById(@PathVariable Long id)
{
    return assetsService.getDeleteById(id);
}
}
