package org.arun.springoauth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StartupTests {

  @Autowired
  private OAuth2RestTemplate ac;

  @Test
  public void contextLoads() {
    System.out.print("+++++++++++++++++"+ac.getAccessToken());
  }

}
