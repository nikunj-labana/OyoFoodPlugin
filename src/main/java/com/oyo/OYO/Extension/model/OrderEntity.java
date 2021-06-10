package com.oyo.OYO.Extension.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Getter
@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderEntity {

    private String account;
    private String object;
    private String object_id;
    private String action;
    private String time;
    private String verify;
    private String account_number;
    private String data;
}
