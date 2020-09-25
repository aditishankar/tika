package org.apache.tika.server.api;


import java.io.IOException;
import java.io.InputStream;
import javax.ws.rs.*;
import org.apache.tika.exception.TikaException;

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
public interface TranslateResourceApi  {

    /**
     * POST a document and auto-detects the *src* language and translates to *dest*
     *
     * POST a document and translates from the *src* language to the *dest*. &lt;b&gt;NOTE&lt;/b&gt;:  *translator* should be a fully qualified Tika class name (with package) and *dest* should be the 2 character short code for the source language.
     *
     */
    @POST
    @Path("/translate/all/src/dest")
    @Produces({ "text/plain" })
    @ApiOperation(value = "POST a document and auto-detects the *src* language and translates to *dest*", tags={ "Translate Resource",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with the translated string, else it will return the original string back.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String postTranslateAllSrcDest(final InputStream is,
            @PathParam("translator") String translator,
            @PathParam("dest") String dLang) throws TikaException, IOException; 

    /**
     * POST a document and translates from the *src* language to the *dest*
     *
     * POST a document and translates from the *src* language to the *dest*. &lt;b&gt;NOTE&lt;/b&gt;:  *translator* should be a fully qualified Tika class name (with package), *src* and *dest* should be the 2 character short code for the source language and dest language respectively.
     *
     */
    @POST
    @Path("/translate/all/translator/src/dest")
    @Produces({ "text/plain" })
    @ApiOperation(value = "POST a document and translates from the *src* language to the *dest*", tags={ "Translate Resource",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with the translated string, else it will return the original string back.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String postTranslateAllTranslatorSrcDest(final InputStream is,
            @PathParam("translator") String translator,
            @PathParam("src") String sLang, @PathParam("dest") String dLang)
            throws TikaException, IOException; 

    /**
     * PUT a document and auto-detects the *src* language and translates to *dest*
     *
     * PUT a document and translates from the *src* language to the *dest*. &lt;b&gt;NOTE&lt;/b&gt;:  *translator* should be a fully qualified Tika class name (with package) and *dest* should be the 2 character short code for the source language.
     *
     */
    @PUT
    @Path("/translate/all/src/dest")
    @Produces({ "text/plain" })
    @ApiOperation(value = "PUT a document and auto-detects the *src* language and translates to *dest*", tags={ "Translate Resource",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with the translated string, else it will return the original string back.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String putTranslateAllSrcDest(final InputStream is,
            @PathParam("translator") String translator,
            @PathParam("dest") String dLang) throws TikaException, IOException;

    /**
     * PUT a document and translates from the *src* language to the *dest*
     *
     * PUT a document and translates from the *src* language to the *dest*. &lt;b&gt;NOTE&lt;/b&gt;:  *translator* should be a fully qualified Tika class name (with package), *src* and *dest* should be the 2 character short code for the source language and dest language respectively.
     *
     */
    @PUT
    @Path("/translate/all/translator/src/dest")
    @Produces({ "text/plain" })
    @ApiOperation(value = "PUT a document and translates from the *src* language to the *dest*", tags={ "Translate Resource" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If successful, this operation returns HTTP status code 200, with the translated string, else it will return the original string back.", response = String.class),
        @ApiResponse(code = 500, message = "An error occurred processing the call.") })
    public String putTranslateAllTranslatorSrcDest(final InputStream is,
            @PathParam("translator") String translator,
            @PathParam("src") String sLang, @PathParam("dest") String dLang)
            throws TikaException, IOException; 
}

