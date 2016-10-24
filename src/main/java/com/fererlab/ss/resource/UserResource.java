package com.fererlab.ss.resource;

import com.fererlab.ss.dto.*;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import java.util.Date;


@Path("/user")
@Produces({"application/json"})
@Consumes({"application/json"})
@Api(value = "/user", description = "user service with authentication authorization methods. Also contains test, list and map methods for testing purposes.")
public class UserResource {

    @POST
    @Path("/login")
    @ApiOperation(value = "login", notes = "login method, accepts username and password in the form of <b>LoginRequestDTO</b> which contains username/password, returns <b>LoginResponseDTO</b>, you can find <b>UserDTO</b> and <b>LastLoginDTO</b> inside.")
    public ResponseDTO login(@ApiParam(value = "Login request DTO, username and password cannot be null or empty") LoginRequestDTO loginRequestDTO) {
        if (loginRequestDTO.getUsername() != null && loginRequestDTO.getUsername() != null) {
            LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
            loginResponseDTO.setUserDTO(new UserDTO("john", "jhon-wick", "13. Elm Street", "555-4433", "john@wick.go"));
            loginResponseDTO.setLastLoginDTO(new LastLoginDTO("92.32.4.30", new Date(), "Chrome 23.344", "MacOS-10.1"));
            return loginResponseDTO;
        } else {
            return ResponseDTO.fail("username and/or password cannot be null");
        }
    }

    @GET
    @Path("/test")
    @ApiOperation(value = "test", notes = "returns a <b>TestDTO</b> which has a message and a random double")
    public TestDTO test() {
        return new TestDTO();
    }

    @GET
    @Path("/list")
    @ApiOperation(value = "list", notes = "returns a <b>GenericList</b> which contains three strings ['a','b','c']")
    public GenericList list() {
        GenericList<String> genericList = new GenericList<>();
        genericList.add("a").add("b").add("c");
        return genericList;
    }

    @GET
    @Path("/map")
    @ApiOperation(value = "map", notes = "returns a <b>GenericMapDTO</b> which contains two pairs {'one':1,'two':2}")
    public GenericMapDTO map() {
        GenericMapDTO<Integer> genericMapDTO = new GenericMapDTO<>();
        genericMapDTO.put("one", 1).put("two", 2);
        return genericMapDTO;
    }

}
