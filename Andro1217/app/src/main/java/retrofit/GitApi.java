package retrofit;

import or.kosta.model.Model;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by kosta on 2015-12-17.
 */
public interface GitApi {
    @GET("/Andro1217/{pathv}")
    public void getFeed(@Path("pathv") String pathv,
                        @Query("id") String id,
                        @Query("password") String password,
                        Callback<Model> model);

}
