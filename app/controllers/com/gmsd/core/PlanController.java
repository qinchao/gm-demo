/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package controllers.com.gmsd.core;

import models.com.gmsd.core.Plan;
import models.com.gmsd.core.PlanRepository;
import org.springframework.transaction.annotation.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Date;

@Named
@Singleton
public class PlanController extends Controller {

  private final PlanRepository planRepository;

  @Inject
  public PlanController(final PlanRepository planRepository) {
    this.planRepository = planRepository;
    _initDemoPlans();
  }

  @Transactional
  public Result queryPlans() {
    Iterable<Plan> plans = planRepository.findAll();
    return Results.ok(Json.toJson(plans));
  }

  @Transactional
  public Result addPlan() {
    // TODO
    return Results.unauthorized("not allowed");
  }

  private void _initDemoPlans() {
    Plan plan1 = new Plan();
    plan1.name = "优选理财计划0064";
    plan1.orderStartTime = new Date();
    plan1.orderEndTime = new Date(System.currentTimeMillis() + 1000 * 3600 * 24);
    plan1.apr = 0.1175;
    planRepository.save(plan1);

    Plan plan2 = new Plan();
    plan2.name = "优选理财计划0082";
    plan2.orderStartTime = new Date(System.currentTimeMillis() + 1000 * 3600 * 24 * 5);
    plan2.orderEndTime = new Date(System.currentTimeMillis() + 1000 * 3600 * 24 * 6);
    plan2.apr = 0.1210;
    planRepository.save(plan2);

    Plan plan3 = new Plan();
    plan3.name = "优选理财计划0088";
    plan3.orderStartTime = new Date(System.currentTimeMillis() + 1000 * 3600 * 24 * 10);
    plan3.orderEndTime = new Date(System.currentTimeMillis() + 1000 * 3600 * 24 * 12);
    plan3.apr = 0.1325;
    planRepository.save(plan3);
  }
}
