package com.example.appclient.controller;

import com.example.appclient.beans.ProductBean;
import com.example.appclient.proxies.MicroserviceProduitProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientUiController {
    @Autowired
    MicroserviceProduitProxy produitProxy;
    @GetMapping("/")
    public List<ProductBean> getProductList(){
        return produitProxy.listeDesProduits();
    }
}
