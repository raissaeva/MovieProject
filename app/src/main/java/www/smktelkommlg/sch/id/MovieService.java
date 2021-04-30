package www.smktelkommlg.sch.id;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MovieService {
    //@GET("/JSONParsingTutorial/jsonMovie")
    //Call<MovieService> getMovies();

    //merubah kode menjadi seperti  berikut
    @GET("/")
    Call<MovieResponse> getMovies();
}
