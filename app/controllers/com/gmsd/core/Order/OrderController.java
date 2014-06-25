/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package controllers.com.gmsd.core.order;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Date;

@Named
@Singleton
public class OrderController extends Controller {

  public Result doOrder() {
    // Logic:
    // 1. Parse the request, and generate the entity
    // 2. Delegate to order manager class
    return Results.forbidden("Unimplemented");
  }

  public Result queryOrder(Long id) {
    return Results.forbidden("Unimplemented");
  }

  public Result queryOrdersByDate(Date startDate, Date endDate) {
    return Results.forbidden("Unimplemented");
  }
}
