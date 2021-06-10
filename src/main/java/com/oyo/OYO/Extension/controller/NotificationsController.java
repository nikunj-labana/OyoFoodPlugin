package com.oyo.OYO.Extension.controller;

import com.oyo.OYO.Extension.service.PosterNotificationProcessor;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationsController {

    @Autowired
    public PosterNotificationProcessor posterNotificationProcessor;

    @PostMapping("/poster")
    public ResponseEntity<Void> notificationGopay(@RequestBody JSONObject requestBody)
            throws Exception {
        posterNotificationProcessor.processNotification(requestBody);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
