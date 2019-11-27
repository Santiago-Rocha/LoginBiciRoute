package edu.eci.ieti.biciroute.services;


import edu.eci.ieti.biciroute.data.LoginWrapper;
import edu.eci.ieti.biciroute.data.Token;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IAuthService {

    @POST("/user/login")
    Call<Token> login(@Body LoginWrapper login);
}