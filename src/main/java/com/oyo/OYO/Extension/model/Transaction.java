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
public class Transaction {
  public String transaction_id;
  public String date_start;
  public String date_start_new;
  public String date_close;
  public String status;
  public String guests_count;
  public String discount;
  public String bonus;
  public String pay_type;
  public String payed_bonus;
  public String payed_card;
  public String payed_cash;
  public String payed_sum;
  public String payed_cert;
  public String payed_third_party;
  public String payed_card_type;
  public String round_sum;
  public String tip_sum;
  public String tips_card;
  public String tips_cash;
  public String sum;
  public String tax_sum;
  public String spot_id;
  public String table_id;
  public String name;
  public String user_id;
  public String client_id;
  public String card_number;
  public String transaction_comment;
  public String reason;
  public String print_fiscal;
  public String total_profit;
  public String total_profit_netto;
  public String table_name;
  public String client_firstname;
  public String client_lastname;
  public String date_close_date;
  public String service_mode;
  public String processing_status;
  public String client_phone;
}
