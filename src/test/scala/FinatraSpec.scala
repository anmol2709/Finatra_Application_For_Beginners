import com.twitter.finagle.http.Status
import com.twitter.finatra.http.EmbeddedHttpServer
import com.twitter.inject.server.FeatureTest

class HelloControllerFeatureTest extends FeatureTest {
  override val server: EmbeddedHttpServer = new EmbeddedHttpServer(
    twitterServer = new FinatraServer)

  test("ExampleServer#perform feature"){
    server.httpGet(
      path = "/hello",
      andExpect = Status.Ok,
      withBody = "Hello From Anmol. Let's Learn Finatra"
    )
  }
}