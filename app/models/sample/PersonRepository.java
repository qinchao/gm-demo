/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package models.sample;

import org.springframework.data.repository.CrudRepository;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Provides CRUD functionality for accessing people. Spring Data auto-magically takes care of many standard
 * operations here.
 */
@Named
@Singleton
public interface PersonRepository extends CrudRepository<Person, Long> {
}