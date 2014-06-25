/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package controllers.com.gmsd.core;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
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
    return Results.forbidden("Unimplemented");
  }

  public Result queryOrder(Long id) {
    return Results.forbidden("Unimplemented");
  }

  public Result queryOrdersByDate(Date startDate, Date endDate) {
    return Results.forbidden("Unimplemented");
  }
}
