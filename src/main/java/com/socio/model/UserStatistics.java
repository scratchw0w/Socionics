package com.socio.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class UserStatistics {

  private String id;
}