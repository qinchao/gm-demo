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

@Named
@Singleton
public class SampleProductController extends Controller {

  public Result clientProducts() {
    ArrayNode products = _getProductList();
    return Results.ok(products);
  }

  /* Sample product list output
  [
    {
      "id": "1",
      "name": "product1",
      "desc": "good!"
    },
    {
      "id": "2",
      "name": "product2",
      "desc": "awesome!"
    },
    {
      "id":"3",
      "name":"product3",
      "desc":"not bad"
    }
  ]
   */
  private ArrayNode _getProductList() {
    final JsonNodeFactory factory = JsonNodeFactory.instance;

    ObjectNode product1 = factory.objectNode();
    product1.put("id", "1");
    product1.put("name", "product1");
    product1.put("desc", "good!");

    ObjectNode product2 = factory.objectNode();
    product2.put("id", "2");
    product2.put("name", "product2");
    product2.put("desc", "awesome!");

    ObjectNode product3 = factory.objectNode();
    product3.put("id", "3");
    product3.put("name", "product3");
    product3.put("desc", "not bad");

    ArrayNode products = factory.arrayNode();
    products.add(product1);
    products.add(product2);
    products.add(product3);

    return products;
  }
}
