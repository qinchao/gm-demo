/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package models.com.gmsd.core.product;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * (保理产品)
 * Provides CRUD functionality for accessing plan. Spring Data auto-magically takes care of many standard
 * operations here.
 */
@Named
@Singleton
public interface FactoringRepository extends CrudRepository<FactoringProduct, Long> {
}
