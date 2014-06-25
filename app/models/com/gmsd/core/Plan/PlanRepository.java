/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package models.com.gmsd.core.plan;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * (理财计划)
 * Provides CRUD functionality for accessing plan. Spring Data auto-magically takes care of many standard
 * operations here.
 */
@Named
@Singleton
public interface PlanRepository extends CrudRepository<Plan, Long> {
}
