package org.apache.tika.server.api;


import java.io.InputStream;
import javax.ws.rs.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

/**
 * Tika JAX-RS Server
 *
 * <p>The Tika server implements [JAX-RS](http://en.wikipedia.org/wiki/JAX-RS) (Java API for RESTful Web Services) to provide web services according to the Representational State Transfer (REST) architectural style. This facilitates a wide varity oif operations and flexibility with regards to both client and server implementations. The officially supported Tika server implementation is packaged using the OpenAPI [jaxrs-cxf generator](https://openapi-generator.tech/docs/generators/jaxrs-cxf]. This work was tracked through [TIKA-3082](https://issues.apache.org/jira/browse/TIKA-3082). <b>N.B.</b> the OpenAPI version always tracks the underlying Tika version to remove uncertainty about which version of Tika is running within the server.
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface LanguageResourceApi  {

    /**
     * POST a UTF-8 text file to the LanguageIdentifier to identify its language.
     *
     * POST a UTF-8 text file to the LanguageIdentifier to identify its language. &lt;b&gt;NOTE&lt;/b&gt;: This endpoint does not parse files.  It runs detection on a UTF-8 string.
     * 
     * @param an {@link InputStream} for which we wish to identify its language
     *  
     */
    @POST
    @Path("/language/stream")
    @Produces({ "text/plain" })
    @ApiOperation(value = "POST a UTF-8 text file to the LanguageIdentifier to identify its language.", tags={ "Language Resource",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with the body being a string of the 2 character identified language.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String postLanguageStream(final InputStream is);

    /**
     * POST a text string to the LanguageIdentifier to identify its language.
     *
     * POST a text string to the LanguageIdentifier to identify its language.
     *
     * @param a {@link java.lang.String} for which we wish to identify its language
     */
    @POST
    @Path("/language/string")
    @Produces({ "text/plain" })
    @ApiOperation(value = "POST a text string to the LanguageIdentifier to identify its language.", tags={ "Language Resource",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with the body being a string of the 2 character identified language.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String postLanguageString(final String string);

    /**
     * PUT a UTF-8 text file to the LanguageIdentifier to identify its language.
     *
     * POST a UTF-8 text file to the LanguageIdentifier to identify its language. &lt;b&gt;NOTE&lt;/b&gt;: This endpoint does not parse files.  It runs detection on a UTF-8 string.
     *
     * @param an {@link InputStream} for which we wish to identify its language
     */
    @PUT
    @Path("/language/stream")
    @Produces({ "text/plain" })
    @ApiOperation(value = "PUT a UTF-8 text file to the LanguageIdentifier to identify its language.", tags={ "Language Resource",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with the body being a string of the 2 character identified language.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String putLanguageStream(final InputStream is);

    /**
     * PUT a text string to the LanguageIdentifier to identify its language.
     *
     * PUT a text string to the LanguageIdentifier to identify its language.
     *
     * @param a {@link java.lang.String} for which we wish to identify its language
     */
    @PUT
    @Path("/language/string")
    @Produces({ "text/plain" })
    @ApiOperation(value = "PUT a text string to the LanguageIdentifier to identify its language.", tags={ "Language Resource" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with the body being a string of the 2 character identified language.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String putLanguageString(final String string);
}

