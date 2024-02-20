package petrova.olga.myapplication.api

import petrova.olga.flickr.api.FlickrResponse
import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET(
        ///services/rest/?method=flickr.interestingness.getList
        // &api_key=84653690f4f33561674bb649d59b5a34
        // &format=json&nojsoncallback=1&extras=url_s
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=84653690f4f33561674bb649d59b5a34" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}