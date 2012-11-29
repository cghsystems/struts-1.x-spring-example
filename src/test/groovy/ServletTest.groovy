import groovyx.net.http.HTTPBuilder
import org.junit.Test

import static groovyx.net.http.ContentType.*
import groovyx.net.http.Method

/**
 * @author: chris
 * @date: 28/11/2012
 */
class ServletTest {

    @Test
    void strutsTest() {
        final strutsUrl = "http://localhost:8080/spring-struts-examples/struts/test"
        executeHttpRequestAgainstRunningServer(strutsUrl)
    }

    @Test
    void springTest() {
        final springUrl = "http://localhost:8080/spring-struts-examples/spring/spring-test"
        executeHttpRequestAgainstRunningServer(springUrl)
    }

    /**
     * Requires that the server is running at http;//localhost:8080. When this tests runs as a Gradle build
     * a server will be started automatically by gradle.build.
     */
    private void executeHttpRequestAgainstRunningServer(String url) {
        final builder = new HTTPBuilder(url)

        builder.request(Method.GET, HTML) {
            // response handler for a success response code:
            response.success = { resp, html ->
                println html.text()
                assert "A Tiles ViewThis is Body.html" == html.text(): "did not get the expected html back from the view: ${html}"
            }

            response.failure = { resp ->
                println "Unexpected error: ${resp.statusLine.statusCode} : ${resp.statusLine.reasonPhrase}"
                assert true == false : "Received unexpected failure"
            }
        }
    }
}
