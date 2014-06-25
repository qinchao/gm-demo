/*
 * Copyright 2014-present GMSD tech inc. All Rights Reserved.
 */

package controllers.com.gmsd.core;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class WithdrawalController extends Controller {

  public Result doWithdraw() {
    return Results.forbidden("Unimplemented");
  }

  public Result queryWithdrawal(Long id) {
    return Results.forbidden("Unimplemented");
  }

}
