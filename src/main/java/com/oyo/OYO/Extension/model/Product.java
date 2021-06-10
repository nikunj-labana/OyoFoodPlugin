package com.oyo.OYO.Extension.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
  public String product_id;
  public String product_name;
  public String modification_id;
  public Object modificator_name;
  public Object modificator_barcode;
  public Object modificator_product_code;
  public String weight_flag;
  public String num;
  public String time;
  public String workshop;
  public String barcode;
  public String product_code;
  public String tax_id;
  public String nodiscount;
  public String payed_sum;
  public String product_sum;
  public String discount;
  public String bonus_sum;
  public String client_id;
  public String promotion_id;
  public String cert_sum;
  public String product_cost;
  public String product_cost_netto;
  public String product_profit;
  public String product_profit_netto;
  public String bonus_accrual;
  public String tax_value;
  public String tax_type;
  public String tax_fiscal;
  public String category_id;
}
