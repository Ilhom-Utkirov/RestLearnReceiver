package com.example.restlearnreceiver.controller;

import com.example.restlearnreceiver.entity.SampleEntity;
import com.example.restlearnreceiver.model.dtos.ReceiveDTO;
import javassist.tools.rmi.Sample;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class RestReceiverController {

    @PostMapping("/request")
    public ResponseEntity<SampleEntity> RequestEndpoint(@RequestBody ReceiveDTO receiveDTO){

        System.out.println("reciveDTO : " + receiveDTO );

        if (receiveDTO != null){
            if (receiveDTO.getId() == 5){
                System.out.println("recieved DTO is ok!");
            }
        }
        SampleEntity retSampleEntity = new SampleEntity(receiveDTO.getId(), receiveDTO.getName(), receiveDTO.getSurname());


        return ResponseEntity.ok(retSampleEntity);
    }

}
