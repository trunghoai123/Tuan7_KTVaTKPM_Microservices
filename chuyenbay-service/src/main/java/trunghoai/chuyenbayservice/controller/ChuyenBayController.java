package trunghoai.chuyenbayservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trunghoai.chuyenbayservice.service.ChuyenBayService;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
    @Autowired
    ChuyenBayService chuyenBayService;
    @GetMapping("/getAll")
    public ResponseEntity getAllChuyenbay(){
        return new ResponseEntity<>(chuyenBayService.getAllChuyenBay(), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity findById(String ma){
        return new ResponseEntity<>(chuyenBayService.findById(ma), HttpStatus.OK);
    }
}
