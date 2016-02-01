package example;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by YiaoS on 12/16/2015.
 */
@WebService
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
}
