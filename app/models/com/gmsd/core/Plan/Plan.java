/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package models.com.gmsd.core.plan;

import javax.persistence.*;
import java.util.Date;

/**
 * This declares a model object for persistence usage. Model objects are generally anaemic structures that represent
 * the database entity. Behaviour associated with instances of a model class are also captured, but behaviours
 * associated with collections of these model objects belong to the PersonRepository e.g. findOne, findAll etc.
 * Play Java will synthesise getter and setter methods for us and therefore keep JPA happy (JPA expects them).
 */
@Entity
@Table()
public class Plan {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long id;

  @Column(nullable = false)
  public String name;

  @Column(nullable = true)
  public String description;

  @Column(nullable = false)
  public Date orderStartTime;

  @Column(nullable = false)
  public Date orderEndTime;

  @Column(nullable = false)
  public Double apr;

  // TODO: (qinchao) update to int with CurrencyAmount class
  @Column(nullable = false)
  public Double totalAmount;

  @Column(nullable = false)
  public Double remainingAmount;

  // TODO: discuss the complete list of fields
}
