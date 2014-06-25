/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package models.com.gmsd.core.product;

import javax.persistence.*;

@Entity
@Table(name = "P2pProduct")
public class P2pProduct extends BaseFinancialProduct {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long id;

  // TODO: other fields
}
